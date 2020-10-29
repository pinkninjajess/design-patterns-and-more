package after.factorymethod;

import after.factorymethod.pizzatypes.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Sally Fields ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("Rob Reiner ordered a " + pizza2.getName() + "\n");

    }
}
