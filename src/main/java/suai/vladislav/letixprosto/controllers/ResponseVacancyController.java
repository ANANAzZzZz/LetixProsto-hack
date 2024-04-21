package suai.vladislav.letixprosto.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import suai.vladislav.letixprosto.Util;
import suai.vladislav.letixprosto.models.vacancy.ResponseVacancy;
import suai.vladislav.letixprosto.models.vacancy.ResultsItem;
import suai.vladislav.letixprosto.services.ResponseVacancyService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@RestController
@RequiredArgsConstructor
public class ResponseVacancyController {
    private final ResponseVacancyService responseVacancyService;

    @GetMapping("/searchByVacancy")
    public ArrayList<ResultsItem> searchByVacancy(@RequestParam(value = "Competencies", defaultValue = "") String CompetenciesName) {
        ArrayList<ResponseVacancy> serviceResponseList = responseVacancyService.getResponse();

        Set<String> comptenciesSet = new HashSet<>(Arrays.asList(CompetenciesName.split(";")));

        ResultsItem match;

        ArrayList<ResultsItem> ans = new ArrayList<>();
        for (ResponseVacancy rv : serviceResponseList) {
            for (int i = 0; i < rv.getResults().size(); i++) {
                match = rv.getResults().get(i);

                Set<String> tempSet =  new HashSet<>(comptenciesSet);;

                for (int j = 0; j < match.getMainVacancyCompetencies().size(); j++) {
                    tempSet.remove(match.getMainVacancyCompetencies().get(j).getName());
                }

                if (tempSet.isEmpty()) {
                    ans.add(match);
                }
            }
        }
        return ans;
    }

    @GetMapping("/getVacancy")
    public ArrayList<ResponseVacancy> getVacancy() {
        return responseVacancyService.getResponse();
    }

    @GetMapping("/addVacancy")
    public void addVacancy() {
        try {
            for (Integer i = 90; i <= 120; i++) {
                String json = Util.getJSONByLink("https://researchinspb.ru/api/v1/public/vacancy/?format=json&pageSize=200&page=" + i);

                ObjectMapper mapper = new ObjectMapper();
                ResponseVacancy responseVacancy = mapper.readValue(json, ResponseVacancy.class);

                System.out.println("Page number:" + i);
                responseVacancyService.saveResponse(responseVacancy);
            }
        } catch (IOException |
                 ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
