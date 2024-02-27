package iuh.fit;

import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class RestaurantFinder {

    public List<String> findThreeJapaneseRestaurants(String filePath) throws Exception {
        List<String> japaneseRestaurants = new ArrayList<>();
        try (InputStream inputStream = new FileInputStream(filePath);
             JsonParser parser = Json.createParser(inputStream)) {
            String key = null;
            while (parser.hasNext() && japaneseRestaurants.size() < 3) {
                JsonParser.Event event = parser.next();
                if (event == JsonParser.Event.KEY_NAME) {
                    key = parser.getString();
                    if ("cuisine".equals(key)) {
                        parser.next();
                        if ("Japanes".equals(parser.getString())) {
                            while (parser.hasNext()) {
                                event = parser.next();
                                if (event == JsonParser.Event.KEY_NAME) {
                                    key = parser.getString();
                                    if ("name".equals(key)) {
                                        parser.next();
                                        japaneseRestaurants.add(parser.getString());
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return japaneseRestaurants;
    }
}
