package suai.vladislav.letixprosto.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suai.vladislav.letixprosto.models.User;
import suai.vladislav.letixprosto.models.vacancy.Response;
import suai.vladislav.letixprosto.services.ResponseVacancyService;
import suai.vladislav.letixprosto.services.UserService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

@RestController
@RequiredArgsConstructor
public class ResponseVacancyController {
    private final UserService userService;
    private final ResponseVacancyService responseVacancyService;

    @GetMapping("/users")
    public ArrayList<User> getUsers() {
        System.out.println(userService.getAllUsers());
        return userService.getAllUsers();
    }

    @GetMapping("/addVacancy")
    public void addVacancy() {
        try {
            URL url = new URL("https://researchinspb.ru/api/v1/public/vacancy/?format=json&pageSize=200");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("Http Response Code : " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

//                System.out.println(informationString);

                JSONParser parser = new JSONParser();
                String json = parser.parse(informationString.toString()).toString();

//                System.out.println(json);

                ObjectMapper mapper = new ObjectMapper();
                Response response = mapper.readValue(json, Response.class);
                System.out.println(response.getResults());

                responseVacancyService.saveResponse(response);
            }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
