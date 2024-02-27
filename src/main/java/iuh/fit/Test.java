package iuh.fit;

import org.junit.jupiter.api.Assertions;

import java.io.BufferedWriter;
import java.io.File;
import java.util.List;

public class Test {
    @org.junit.jupiter.api.Test
    public void test() throws Exception {
        RestaurantFinder finder = new RestaurantFinder();
        List<String> japaneseRestaurants = finder.findThreeJapaneseRestaurants("data/mockdata.json");

        Assertions.assertEquals(3, japaneseRestaurants.size());

        // Write test result to file
        try (BufferedWriter writer = new BufferedWriter(new java.io.FileWriter(new File("data/21088201_TranNguyenVu.txt")))) {
            for (String restaurant : japaneseRestaurants) {
                writer.write(restaurant);
                writer.newLine();
            }
        }
    }
}
