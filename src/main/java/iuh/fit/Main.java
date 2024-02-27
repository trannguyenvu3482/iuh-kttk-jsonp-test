package iuh.fit;

import javax.json.Json;
import javax.json.stream.JsonParser;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Read json file
        InputStream inputStream = new FileInputStream("data/mockdata.json");
        JsonParser parser = Json.createParser(inputStream);
        String key = null;
        String value = null;
        while (parser.hasNext()) {
            JsonParser.Event event = parser.next();
            switch (event) {
                case KEY_NAME:
                    key = parser.getString();
                    System.out.println(key);
                    break;
                case VALUE_STRING:
                    value = parser.getString();
                    System.out.println(value);
                    break;
                case START_ARRAY:
                    System.out.println("Start array");
                    break;
                case END_ARRAY:
                    System.out.println("End array");
                    break;
                case START_OBJECT:
                    System.out.println("Start object");
                    break;
                case END_OBJECT:
                    System.out.println("End object");
                    break;
                case VALUE_NUMBER:
                    System.out.println(parser.getInt());
                    break;
                case VALUE_TRUE:
                    System.out.println("true");
                    break;
                case VALUE_FALSE:
                    System.out.println("false");
                    break;
                case VALUE_NULL:
                    System.out.println("null");
                    break;
                default:
                    break;
            }
        }

        // Close the parser
        parser.close();

//         b.	Dựa trên tập dữ liệu đầy đủ, cung cấp kèm. Tìm 3 restaurant chuyên phục vụ cẩm thực Nhật ("cuisine":"Japanese")
        int count = 0;
        RestaurantFinder finder = new RestaurantFinder();
        List<String> japaneseRestaurants = finder.findThreeJapaneseRestaurants("data/mockdata.json");

        for (String restaurant : japaneseRestaurants) {
            System.out.println(restaurant);
        }

        // Unit test using Junit
        Test test = new Test();
        test.test();
    }

}
