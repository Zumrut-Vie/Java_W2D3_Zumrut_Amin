package Amin.A1;

public class City {
    String cityName;
    double currentTemperature;

    // constructor
    public City (String name, double temp) {
        this.cityName = name;
        this.currentTemperature = temp;
    }

    @Override
    public String toString () { // overriding toString of object - to print text instead of hashcode.
        return String.format("{ %s, %.1f \u2103 }", cityName, currentTemperature);
    }
}
