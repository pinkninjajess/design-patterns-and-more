package after.abstractfactory;

import after.abstractfactory.ingredients.ingredientfactories.ChicagoPizzaIngredientFactory;
import after.abstractfactory.ingredients.ingredientfactories.PizzaIngredientFactory;
import after.abstractfactory.pizzatypes.*;

/**
 * The ConcreteCreator
 * implements the factoryMethod() which is the method that actually produces products
 * - Concretecreator classes have the knowledge of how to create the products
 */
public class ChicagoPizzaStore extends PizzaStore {
    Pizza pizza = null;

    /**
     * The Abstract Factory is implemented via composition
     * by including PizzaIngredientFactory
     * - this prevents us from having to create different types of CheesePizzas for each region, as we did when
     * only using the Factory Method
     */
    PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();

    @Override
    Pizza createPizza(String item) {
        if(item.equals("cheese")){
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Veggie Pizza");
        } else if (item.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        } else if (item.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago Style Pepperoni Pizza");
        }
        return pizza;
    }
}
