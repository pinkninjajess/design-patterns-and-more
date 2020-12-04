package after.singleton;

import before.singleton.nonmultithreaded.Singleton;

public class SingletonSynchronized {
    private static SingletonSynchronized uniqueInstance;

    // other useful instance variables here

    private SingletonSynchronized() {}

    /**
     * Adding the synchronized keyword forces each thread to wait its turn before entering the method
     * Note: can have performance hits - can decrease performance by a factor of 100 :S
     * @return SingletonSynchronized
     */
    public static synchronized SingletonSynchronized getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SingletonSynchronized();
        }
        return uniqueInstance;
    }
}
