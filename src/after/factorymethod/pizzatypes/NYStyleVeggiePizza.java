package after.factorymethod.pizzatypes;

/**
 * ConcreteProduct class
 */
public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza() {
        this.name = "NY Style Veggie Pizza";
        this.dough = "Thin Crust Dough";
        this.sauce = "Marinara Sauce";
        this.toppings.add("Grated Reggiano Cheese");
        this.toppings.add("Garlic");
        this.toppings.add("Onion");
        this.toppings.add("Mushrooms");
        this.toppings.add("Red Pepper");
    }
}
