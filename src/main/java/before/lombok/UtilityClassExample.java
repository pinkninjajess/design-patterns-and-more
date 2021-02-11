package main.java.before.lombok;

/**
 * A utility class is a class that is just a namespace for functions
 * - no instances of it can exist, and all its members are static
 */
public class UtilityClassExample {

    private static final int CONSTANT = 5;

    private UtilityClassExample() {
        throw new java.lang.UnsupportedOperationException("This is a utility class and should not be and " +
                "cannot be instantiated");
    }

    public static int addSomething(int in) {
        return in + CONSTANT;
    }

}
