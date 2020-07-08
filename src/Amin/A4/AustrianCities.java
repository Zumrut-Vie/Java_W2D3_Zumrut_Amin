package Amin.A4;

import java.util.ArrayList;

public class AustrianCities {
    ArrayList<City> cty;

    // constructor
    public AustrianCities (ArrayList<City> cty) {
        this.cty = cty;
    }

    // method 1
    public void printCityNames() {
        System.out.println("\nAustrian states capitals are: \n");
        for (City item : cty) {
            System.out.println(item.name);
        }
    }


    // method 2
    public void printCityCitizenNumbers () {
        System.out.println("\nPopulation of Austrian states capitals are: \n");
        for (City item : cty) {
            System.out.println(item.citizensNum);
        }
    }

    // method 3
    public void printAllCityData () {
        System.out.println("\nData of Austrian states capitals: \n");
        for (City item : cty) {
            System.out.printf("%s has %d residents.\n", item.name, item.citizensNum);
        }
    }

    // method 4
    public void printTotalNumberOfCitizens () {
        System.out.println("\nTotal population: \n");
        int total = 0;
        for (City item : cty) {
            System.out.printf("%s, %d\n", item.name, item.citizensNum);
            total += item.citizensNum;
        }
        System.out.printf("\n=========================\n TOTAL: %d\n", total);
    }

}
