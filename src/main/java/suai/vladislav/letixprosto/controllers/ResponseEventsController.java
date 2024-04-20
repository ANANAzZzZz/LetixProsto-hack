package suai.vladislav.letixprosto.controllers;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suai.vladislav.letixprosto.models.events.Response;
import suai.vladislav.letixprosto.services.ResponseEventsService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

@RestController
@RequiredArgsConstructor
public class ResponseEventsController {
    private final ResponseEventsService responseEventsService;

    @GetMapping("/getResponse")
    public ArrayList<Response> getResponseItem() {
        System.out.println(responseEventsService.getAllResponse());
        return responseEventsService.getAllResponse();
    }

    @GetMapping("/setResponse")
    public boolean setResponse() {
        try {
            URL url = new URL("https://researchinspb.ru/api/v1/public/event/?format=json&pageSize=200");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responseCode = conn.getResponseCode();

            if (responseCode != 200) {
                throw new RuntimeException("Http suai.vladislav.letixprosto.models.events.Response Code : " + responseCode);
            } else {
                StringBuilder informationString = new StringBuilder();
                Scanner scanner = new Scanner(url.openStream());
                while (scanner.hasNext()) {
                    informationString.append(scanner.nextLine());
                }
                scanner.close();

                System.out.println(informationString);

                JSONParser parser = new JSONParser();
                String json = parser.parse(informationString.toString()).toString();

                ObjectMapper m = new ObjectMapper();
                Response response = m.readValue(json,Response.class);
                responseEventsService.setResponse(response);
                return true;

            }

        } catch (IOException | ParseException e) {
            throw new RuntimeException(e);
        }
    }
}