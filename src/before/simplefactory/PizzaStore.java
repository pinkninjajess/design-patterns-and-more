package before.simplefactory;

public class PizzaStore {
    Pizza pizza;

    Pizza orderPizza(String type) {

        /**
         * Note: the following code is NOT closed for modification.
         * If the Pizza Shop changes its pizza offerings, we have to get into this
         * code and modify it
         */
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

}
