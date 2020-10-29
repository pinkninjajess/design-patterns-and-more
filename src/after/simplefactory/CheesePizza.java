package after.simplefactory;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        this.name = "Cheese Pizza";
        this.dough = "Regular Crust";
        this.sauce = "Marinara Pizza Sauce";
        this.toppings.add("Fresh Mozzarella");
        this.toppings.add("Parmesan");
    }
}
