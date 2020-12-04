package before.singleton.nonmultithreaded;

/**
 * The Singleton Pattern ensures a class has only one instance, and provides a global point of access to it
 *  - we are taking a class and letting it manage a single instance of itself
 *  - we are also providing a global access point to that instance
 */
public class Singleton {

    /**
     * Static variable to hold our one instance of the class Singleton
     */
    private static Singleton uniqueInstance;

    /**
     * Our constructor is declared private; only Singleton can instantiate this class
     */
    private Singleton() {}

    // other instance variables

    /**
     * The getInstance() method gives us a way to instantiate the class and also to return an instance of it
     * @return Singleton
     */
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other methods
}
