package main.java.after.lombok;

import lombok.experimental.UtilityClass;

/**
 * By using this annotation, lombok will automatically
 * - generate a private constructor that throws an exception
 * - flags as error any explicit constructors you add
 * - marks the class 'final'
 * - if the class is an 'inner class,' it is also marked 'static' *
 */
@UtilityClass
public class UtilityClassExample {
    private final int CONSTANT = 5;

    public int addSomething(int in) {
        return in + CONSTANT;
    }
}
