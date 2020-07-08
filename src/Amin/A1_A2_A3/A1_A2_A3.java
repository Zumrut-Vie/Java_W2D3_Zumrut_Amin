package Amin.A1_A2_A3;
import java.util.*;

// Question: why we can't create ArrayList outside of main method in another class??
public class A1_A2_A3 {

    public static void main(String[] args) {
        List<String> cities = Arrays.asList( // keep the list of strings, then all can be added at once
                "Vienna", "Graz", "Linz", "Salzburg", "Innsbruck", "Klagenfurt");
        List<Double> temp = Arrays.asList(23.0, 22.0, 19.5, 18.5, 17.0, 20.5);

        ArrayList<String> austrianCities = new ArrayList<>();
        austrianCities.addAll(cities); // add all at once to 'austiranCities' ArrayList

        ArrayList<Double> austrianCitiesTemp = new ArrayList<>();
        austrianCitiesTemp.addAll(temp);
        System.out.println(" ================================== A1 - Part 1 " +
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


        // ==================================================================================

        System.out.println("\n================================== A1 - Part 2 " +
                "=====================================");
        for (Object item : cityObjects) {
            System.out.println(item);
        }


        // ==================================================================================

        System.out.println("\n================================== A2 - Part 1" +
                "=====================================");

        System.out.println("Austrian cities before sort: \n" + austrianCities);
        Collections.sort(austrianCities); // sort inplace
        System.out.println("\nAustrian cities after sort: \n" + austrianCities);


        // ==================================================================================

        System.out.println("\n================================== A2 - Part 2" +
                "=====================================");

        System.out.println("For joining two ArrayLists, we can use the method 'addAll()'.");

        ArrayList<String> austrianVillages = new ArrayList<>();
        austrianVillages.add("Baden");
        austrianVillages.add("Moedling");
        austrianVillages.add("Leoben");

        // join two with 'addAll()' method
        System.out.println("Before adding villages: \n" + austrianCities);
        austrianCities.addAll(austrianVillages); // add them inplace
        System.out.println("After adding villages: \n" + austrianCities);


        // ==================================================================================

        System.out.println("\n================================== A2 - Part 3" +
                "=====================================");
        System.out.println("\nUsing new method: 'contains()'.");
        String newCity = "Krems";
        boolean isInArrayList = austrianCities.contains(newCity);
        if (isInArrayList) {
            System.out.println(newCity + " is in our list of cities.");
        } else {
            System.out.println(newCity + " is NOT in our list of cities.");
        }
        System.out.println("\nUsing new method: 'isEmpty()'.");


        if (austrianCities.isEmpty()) {
            System.out.println("Our list of cities is empty!");
        } else {
            System.out.println("Our list contains following cities: \n" + austrianCities );
        }

        // ==================================================================================

        System.out.println("\n================================== A2 - Part 4" +
                "=====================================");
        System.out.println("Insert an element into the first position with 'add.(index, element)'");

        System.out.println("\nBefore adding first element: \n" + austrianCities);
        austrianCities.add(0, "NEW CITY"); // inplace method
        System.out.println("\nAfter adding first element: \n" + austrianCities);


        // ==================================================================================

        System.out.println("\n================================== A3 - Part 1 & 2" +
                "=====================================");

        String str = "Linz";
        int indOfStr = austrianCities.indexOf(str);
        System.out.println("\nBefore update: " + austrianCities);
        austrianCities.set(indOfStr, "Villach"); // inplace method
        System.out.println("\nAfter update: " + austrianCities);

        // remove third element
        austrianCities.remove(2); // inplace method - 'Innsbruck' removes.

        System.out.println("\n================================== A3 - Part 3" +
                "=====================================");

        Collections.sort(austrianCities, Collections.reverseOrder()); // descending order
        System.out.println("\nReverse order - descending: " + austrianCities);

    }





}
