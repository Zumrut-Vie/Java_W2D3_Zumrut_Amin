package Amin.A4;

import java.util.Comparator;

public class SortByNameAsc implements Comparator<City> { // custom sort
        @Override
        public int compare(City obj1, City obj2) {
            return obj1.name.compareTo(obj2.name);
        }

}
