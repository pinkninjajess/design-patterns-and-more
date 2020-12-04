package after.abstractfactory;

import after.abstractfactory.ingredients.ingredientfactories.NYPizzaIngredientFactory;
import after.abstractfactory.ingredients.ingredientfactories.PizzaIngredientFactory;
import after.abstractfactory.pizzatypes.*;

/**
 * The ConcreteCreator
 * implements the factoryMethod() which is the method that actually produces products
 */
public class NYPizzaStore extends PizzaStore {
    Pizza pizza = null;

    /**
     * The abstract factory is implemented via composition
     */
    PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
