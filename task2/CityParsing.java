package task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class CityParsing {

    private ArrayList<City> cityList;

    public CityParsing() throws FileNotFoundException {
        this.cityList = takeInfo();
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

    public void printCities() {
        for (City city : this.cityList) {
            System.out.println(city);
        }
    }

    public void sortCitiesByName() {
        this.cityList.sort(new Comparator<City>() {
            @Override
            public int compare(City city1, City city2) {
                return city1.getName().compareToIgnoreCase(city2.getName());
            }
        });
    }

    public void sortCitiesByDistrict() {
        sortCitiesByName();
        this.cityList.sort(new Comparator<City>() {
            @Override
            public int compare(City city1, City city2) {
                return city1.getDistrict().compareTo(city2.getDistrict());
            }
        });
    }
}