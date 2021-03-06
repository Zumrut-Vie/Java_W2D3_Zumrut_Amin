package Amin.A4;

import java.util.*;

public class A4 {


    public static void main(String[] args) {
        ArrayList<City> capitals = new ArrayList<>();
        City viennaCapital = new City("Vienna", 1_890_000);
        City lowAustCapital = new City("Sankt Poelten", 54_600);
        City upAustCapital = new City("Linz", 204_800);
        City styriaCapital = new City("Graz", 294_600);
        City tyrolCapital = new City("Innsbruck", 132_400);
        City carinCapital = new City("Klagenfurt", 100_300);
        City salzCapital = new City("Salzburg", 156_800);
        City voralCapital = new City("Bregenz", 29_800);
        City burgCapital = new City("Eisenstadt", 14_400);

        List<City> myList = Arrays.asList(viennaCapital, lowAustCapital, upAustCapital,
                styriaCapital, tyrolCapital, carinCapital, salzCapital, voralCapital, burgCapital);

        capitals.addAll(myList); // add all City objects to ArrayList at once.
        for (City item : capitals) {
            System.out.println(item);
        }


        // =====================================AustrianCities====================================

        System.out.println("=====================================" +
                "AustrianCities==============================");
        // use 'capitals' to construct an object
        AustrianCities cityObject = new AustrianCities(capitals);

        // try method printCityNames()
        cityObject.printCityNames();


        // try method printCityCitizenNumbers()
        System.out.println("\n--------------------------------------");
        cityObject.printCityCitizenNumbers();

        // try method printAllCityData()
        System.out.println("\n--------------------------------------");
        cityObject.printAllCityData();

        // try method printTotalNumberOfCitizens()
        System.out.println("\n--------------------------------------");
        cityObject.printTotalNumberOfCitizens();

        // =========================================== A4 - sort by name ================================
        System.out.println("\n=========================================" +
                " A4 - sort by name (Ascending) ============================================");

        Collections.sort(capitals, new SortByNameAsc()); // custom sort by name
        for (City item : capitals) {
            System.out.println(item);
        }

        System.out.println("\n=========================================" +
                " A4 - sort by name (Descending) ============================================");

        Collections.sort(capitals, new SortByNameDesc()); // custom sort by name
        for (City item : capitals) {
            System.out.println(item);
        }


        // ===================================== A4 - sort by residents ==============================
       System.out.println("\n=========================================" +
                "A4 - sort by residents (Ascending) ============================================");

        Collections.sort(capitals, new SortByResidentsAsc());
        for (City item : capitals) {
            System.out.println(item);
        }

        System.out.println("\n=========================================" +
                "A4 - sort by residents (Descending) ============================================");

        Collections.sort(capitals, new SortByResidentsDesc());
        for (City item : capitals) {
            System.out.println(item);
        }

    }

}
