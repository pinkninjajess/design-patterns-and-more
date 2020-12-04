package after.simplefactory;

/**
 * By encapsulating the pizza creation in one class, we now have only one place to make modifications when the
 * implementation changes
 */
public class SimplePizzaFactory {
    public SimplePizzaFactory() {
    }

    /**
     * Another common practice is to define the factory as a static method
     * so that an object does not need to be instantiated
     *
     * Disadvantage of using static implementation:
     * - you can't subclass and change the behaviour of the create method
     */
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return (Pizza)pizza;
    }
}
