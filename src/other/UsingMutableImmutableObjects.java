package other;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class UsingMutableImmutableObjects {

    public static void main(String[] args) {

        Date birthDate = new GregorianCalendar(1980, Calendar.FEBRUARY, 11).getTime();

        PersonMutable personMutable = new PersonMutable("June Osbourne", 35, birthDate);
        personMutable.favouriteNumber = 37;
        personMutable.name = "Janine";

        final PersonMutable personMutable2 = new PersonMutable("Edith", 14, birthDate);
        //personMutable2 = new PersonMutable("Janine", 36, birthDate); // not possible to reassign to this, because it is a final variable

        PersonImmutable personImmutable = new PersonImmutable("Aunt Lydia", 65, birthDate);
        System.out.println(personImmutable.getDob());
        personImmutable.getDob().setTime(614166507000L);
        System.out.println(personImmutable.getDob()); // the dob will not change when using a 'clone' in the getter

        String name = "Commander Lawrence";
        name = "Commander Waterford"; // a new reference is created holding this new value (the old value of 'Commander Lawrence' is discarded)

        // StringBuilder is handy when a String will be updated frequently - perhaps in iterations
        StringBuilder commanderName = new StringBuilder("Commander ");
        commanderName.append("Lawrence");
        commanderName.replace(10, commanderName.length(), "Waterford");
        System.out.println(commanderName.toString());
    }
}
