package suai.vladislav.letixprosto.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suai.vladislav.letixprosto.Util;
import suai.vladislav.letixprosto.models.User;
import suai.vladislav.letixprosto.models.vacancy.ResponseVacancy;
import suai.vladislav.letixprosto.services.ResponseVacancyService;
import suai.vladislav.letixprosto.services.UserService;

import java.io.IOException;
import java.util.ArrayList;

@RestController
@RequiredArgsConstructor
public class ResponseVacancyController {
    private final ResponseVacancyService responseVacancyService;

    @GetMapping("/getVacancy")
    public ArrayList<ResponseVacancy> getVacancy() {
        return responseVacancyService.getResponse();
    }

    @GetMapping("/addVacancy")
    public void addVacancy() {
        try {
            for (Integer i = 1; i <= 5; i++) {
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
