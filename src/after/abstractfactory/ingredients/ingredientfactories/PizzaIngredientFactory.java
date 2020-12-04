package after.abstractfactory.ingredients.ingredientfactories;

import after.abstractfactory.ingredients.*;

/**
 * Abstract Factory
 */
public interface PizzaIngredientFactory {

    /**
     * The functions below are examples of factory methods
     * Concrete Factories often implement a factory method to
     * create a *family* of products
     *
     * (In other words / Autrement dit:
     * Methods to create products in an Abstract Factory are often implemented
     * with a factory method)
     */
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni createPepperoni();
    Clams createClams();
}
