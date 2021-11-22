package task3;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            CityParsing parser = new CityParsing();
            City mostPopulatedCity = parser.getMostPopulatedCity();
            System.out.printf("[%d] = %d\n", mostPopulatedCity.getId() - 1, mostPopulatedCity.getPopulation());
        } catch (FileNotFoundException e) {
            System.out.println("File error");
        }

    }
}
