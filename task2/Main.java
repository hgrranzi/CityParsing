package task2;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            CityParsing parser = new CityParsing();
            parser.sortCitiesByName();
            parser.printCities();
            System.out.println();
            parser.sortCitiesByDistrict();
            parser.printCities();
        } catch (FileNotFoundException e) {
            System.out.println("File error");
        }

    }
}
