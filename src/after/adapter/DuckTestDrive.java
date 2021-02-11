package after.adapter;

/**
 * Client
 */
public class DuckTestDrive {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        mallardDuck.quack();
        mallardDuck.fly();

        /**
         * 1) The client makes a request to the adapter by calling a method on it using the target interface
         *     (In this case, the target interface is Duck)
         */
        /**
         * 2) The adapter translates the request into one or more calls on the adaptee, using the adaptee interface
         *    (In this case, the adaptee interface is Turkey)
         */
        System.out.println("\nThe TurkeyAdapter says...");
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        /**
         * The client receives the results of the call, and never knows that there is an adapter doing the translation
         */
    }

}
