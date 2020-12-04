package after.singleton;

/**
 * This is a good option if the application always creates and uses an instance of the Singleton
 * and/or if the overhead of creation and runtime aspects of the Singleton are not onerous
 */
public class SingletonEagerlyCreated {
    private static SingletonEagerlyCreated uniqueInstance = new SingletonEagerlyCreated();

    private SingletonEagerlyCreated() {}

    public static SingletonEagerlyCreated getInstance() {
        return uniqueInstance;
    }
}
