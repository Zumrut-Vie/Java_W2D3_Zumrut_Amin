package Amin.A4;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

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

    NumberFormat format = NumberFormat.getInstance(Locale.US); // to have 1,000,000
    // method 2
    public void printCityCitizenNumbers () {
        System.out.println("\nPopulation of Austrian states capitals are: \n");
        for (City item : cty) {
            System.out.println(format.format(item.citizensNum));
        }
    }

    // method 3
    public void printAllCityData () {
        System.out.println("\nData of Austrian states capitals: \n");
        for (City item : cty) {
            System.out.printf("%s has %s residents.\n", item.name, format.format(item.citizensNum));
        }
    }

    // method 4
    public void printTotalNumberOfCitizens () {
        System.out.println("\nPopulation & total: \n");
        int total = 0;
        for (City item : cty) {
            System.out.printf("%-20s %s %n", item.name, format.format(item.citizensNum));
            total += item.citizensNum;
        }
        System.out.printf("============================ %n%-20s %s %n", "TOTAL",format.format(total));
    }

}
