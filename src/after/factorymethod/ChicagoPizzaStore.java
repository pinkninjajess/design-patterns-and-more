package after.factorymethod;

import after.factorymethod.pizzatypes.*;

/**
 * The ConcreteCreator
 * implements the factoryMethod() which is the method that actually produces products
 * - concretecreator classes have the knowledge of how to create the products
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if (item.equals("veggie")) {
            return new ChicagoStyleVeggiePizza();
        } else if (item.equals("clam")) {
            return new ChicagoStyleClamPizza();
        } else if (item.equals("pepperoni")) {
            return new ChicagoStylePepperoniPizza();
        }
        else return null;
    }
}
