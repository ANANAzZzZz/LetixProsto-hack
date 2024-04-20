package suai.vladislav.letixprosto;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class Util {
    public static String getJSONByLink(String link) throws IOException, ParseException {
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

//            System.out.println(informationString);

            JSONParser parser = new JSONParser();
            String json = parser.parse(informationString.toString()).toString();

//            System.out.println(json);

            return json;
        }
    }
}
