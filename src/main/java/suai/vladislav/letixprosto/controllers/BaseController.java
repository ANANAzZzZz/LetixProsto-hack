package suai.vladislav.letixprosto.controllers;

import com.mongodb.client.MongoCursor;
import lombok.RequiredArgsConstructor;
import org.json.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suai.vladislav.letixprosto.models.User;
import suai.vladislav.letixprosto.services.UserService;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@RestController
@RequiredArgsConstructor
public class BaseController {
//    @Autowired
//    private final UserService userService;

//    @GetMapping("/")
//    public ArrayList<User> getBase() {
//        System.out.println(userService.getAllUsers());
//        return userService.getAllUsers();

//        try {
//            URL url = new URL("https://researchinspb.ru/api/v1/public/event/?format=json");
//
//            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
//            conn.setRequestMethod("GET");
//            conn.connect();
//
//            int responseCode = conn.getResponseCode();
//
//            if (responseCode != 200) {
//                throw new RuntimeException("Http Response Code : " + responseCode);
//            } else {
//                StringBuilder informationString = new StringBuilder();
//                Scanner scanner = new Scanner(url.openStream());
//                while (scanner.hasNext()) {
//                    informationString.append(scanner.nextLine());
//                }
//                scanner.close();

//                System.out.println(informationString);

//                JSONParser parser = new JSONParser();
//                Object json = parser.parse(informationString.toString());

//                System.out.println(json);



//            }
//
//        } catch (IOException | ParseException e) {
//            throw new RuntimeException(e);
//        }



//        return "123";
//    }
}
