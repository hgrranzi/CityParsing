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
        scanner.close();
        for (City city : cityList) {
            System.out.println(city);
        }
    }
}
