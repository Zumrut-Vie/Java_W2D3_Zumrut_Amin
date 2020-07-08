package Amin.A4;

public class City {
    String name;
    int citizensNum;

    // constructor
    public City (String name, int n) {
        this.name = name;
        this.citizensNum = n;
    }

    @Override
    public String toString () { // overriding toString of object - to print text instead of hashcode.
        return String.format("{%s, %d}", name, citizensNum);
    }
}
