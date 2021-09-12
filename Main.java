import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<City> cityList = new ArrayList<>();
        File file = new File("city_ru.csv");
        Scanner scanner = null;
        String[] info;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
            System.exit(1);
        }
        while (scanner.hasNextLine()) {
            info = scanner.nextLine().split(";");
            cityList.add(new City(info));
        }
        for (City city : cityList) {
            System.out.println(city);
        }
    }
}

class City {
    private final int id;
    private final String name;
    private final String region;
    private final String district;
    private final int population;
    private final String foundation;

    public City(String[] info) {
        this.id = Integer.parseInt(info[0]);
        this.name = info[1];
        this.region = info[2];
        this.district = info[3];
        this.population = Integer.parseInt(info[4]);
        if (info.length > 5) {
            this.foundation = info[5];
        } else {
            this.foundation = "";
        }
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return this.id;
    }

    public String getRegion() {
        return region;
    }

    public String getDistrict() {
        return district;
    }

    public int getPopulation() {
        return population;
    }

    public String getFoundation() {
        return foundation;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", region='" + region + '\'' +
                ", district='" + district + '\'' +
                ", population=" + population +
                ", foundation='" + foundation + '\'' +
                '}';
    }
}