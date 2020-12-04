package after.singleton;

import before.singleton.nonmultithreaded.Singleton;

public class SingletonDoubleCheckedLocking {
    /**
     * The volatile keyword ensures that multiple threads handle the uniqueInstance variable correctly when it
     * is being initialized to the Singleton instance
     *
     * This method only works with Java 5 and up
     */
    private volatile static SingletonDoubleCheckedLocking uniqueInstance;

    private SingletonDoubleCheckedLocking() {}

    public static SingletonDoubleCheckedLocking getInstance() {
        if (uniqueInstance == null) {
            /**
             * We only synchronize the first way through
             */
            synchronized (SingletonDoubleCheckedLocking.class) {
                /**
                 * Because it's possible that two threads got to this point, we check again that the uniqueInstance is null
                 * If null, create an instance
                 */
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonDoubleCheckedLocking();
                }
            }
        }
        return uniqueInstance;
    }

}
