package other;

import java.util.Date;

/**
 * Objects cannot be altered after creation
 * - Immutability is great for caching and for creating constants
 * - making a class 'final' prevents it from being extended and it becoming intentionally or unintentionally mutable
 */
public final class PersonImmutable {
    private final String name;
    private final int favouriteNumber;
    private final Date dob;

    public PersonImmutable(String name, int favouriteNumber, Date dob) {
        this.name = name;
        this.favouriteNumber = favouriteNumber;
        //this.dob = dob; // using it directly would take the reference, which could then be modified
        this.dob = new Date(dob.getTime()); // make a clone to protect the data
    }

    public Date getDob() {
        // return dob; // this provides a reference which could then be modified
        return new Date(this.dob.getTime()); // make a clone to protect the data
    }
}
