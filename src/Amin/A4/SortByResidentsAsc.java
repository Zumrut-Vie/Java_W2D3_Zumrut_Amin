package Amin.A4;

import java.util.Comparator;

public class SortByResidentsAsc implements Comparator<City> {
    @Override
    public int compare (City obj1, City obj2) {
        return (obj1.citizensNum -  obj2.citizensNum);
    }
}
