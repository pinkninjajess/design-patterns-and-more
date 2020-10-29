package after.factorymethod;

import after.factorymethod.pizzatypes.Pizza;

/**
 * The Creator
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * A factory method handles object creation and encapsulates it in a subclass.  This decouples the client code
     * in the superclass from the object creation code in the subclass
     *
     * Note: a factory method may be parameterized (or not) to select among several variations of a product
     */
    abstract Pizza createPizza(String type);

}
