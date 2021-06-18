package other;

import java.util.Date;

/**
 * Mutable - can be altered after creation
 */
public class PersonMutable {
    String name;
    int favouriteNumber;
    Date dob;

    public PersonMutable(String name, int age, Date dob) {
        this.name = name;
        this.favouriteNumber = age;
        this.dob = dob;
    }

    public Date getDob() {
        return dob;
    }
}
