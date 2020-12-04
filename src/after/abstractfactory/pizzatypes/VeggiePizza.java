package after.abstractfactory.pizzatypes;

import after.abstractfactory.ingredients.ingredientfactories.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory pizzaIngredientFactory;

    public VeggiePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }
    @Override
    public void prepare() {
        System.out.println("Preparing... " + name);
        dough = pizzaIngredientFactory.createDough();
        cheese = pizzaIngredientFactory.createCheese();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
