package Amin.A1;
import java.util.*;

// Question: why we can't create ArrayList outside of main method in another class??
public class A1 {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList( // keep the list of strings, then all can be added at once
                "Vienna", "Graz", "Linz", "Salzburg", "Innsbruck", "Klagenfurt");
        List<Double> temp = Arrays.asList(23.0, 22.0, 19.5, 18.5, 17.0, 20.5);

        ArrayList<String> austrianCities = new ArrayList<>();
        austrianCities.addAll(cities);

        ArrayList<Double> austrianCitiesTemp = new ArrayList<>();
        austrianCitiesTemp.addAll(temp);
        System.out.println(" ================================== Part 1 " +
                "====================================="); // just for separation
        System.out.println("\n6 major Austrian cities: " + austrianCities);
        System.out.println("\nCurrent temperature of above cities: " + austrianCitiesTemp);

        ArrayList<Object> cityObjects = new ArrayList<>();
        for (int i = 0; i < austrianCities.size(); i++) {
            String cityName = austrianCities.get(i);
            double cityTemp = austrianCitiesTemp.get(i);
            City cty = new City(cityName, cityTemp);

            cityObjects.add(cty);

        }

        System.out.println("\n================================== Part 2 " +
                "=====================================");
        for (Object item : cityObjects) {
            System.out.println(item);
        }



    }


}
