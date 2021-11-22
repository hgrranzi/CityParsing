package task4;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            CityParsing parser = new CityParsing();
            parser.printRegionMap();
        } catch (FileNotFoundException e) {
            System.out.println("File error");
        }

    }
}
