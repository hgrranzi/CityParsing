package task1;

import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cityList;

        try {
            cityList = takeInfo();
            for (City city : cityList) {
                System.out.println(city);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File error");
        }
    }

    static ArrayList<City> takeInfo() throws FileNotFoundException {
        ArrayList<City> cityList = new ArrayList<>();
        File file = new File("city_ru.csv");
        Scanner scanner = new Scanner(file);
        String[] info;
        while (scanner.hasNextLine()) {
            info = scanner.nextLine().split(";");
            cityList.add(new City(info));
        }
        scanner.close();
        return cityList;
    }
}
