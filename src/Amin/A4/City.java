package Amin.A4;

import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Locale;

public class City {
    String name;
    int citizensNum;

    // constructor
    public City (String name, int n) {
        this.name = name;
        this.citizensNum = n;
    }

    NumberFormat format = NumberFormat.getInstance(Locale.US); // to have 1,000,000
    @Override
    public String toString () { // overriding toString of object - to print text instead of hashcode.
        return String.format("%-20s %s residents", name, format.format(citizensNum));
    }




}
