package after.factorymethod;

import after.factorymethod.pizzatypes.*;

/**
 * The ConcreteCreator
 * implements the factoryMethod() which is the method that actually produces products
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new NYStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new NYStylePepperoniPizza();
        }
        else return null;
    }
}
