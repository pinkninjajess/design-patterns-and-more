package after.abstractfactory;


import after.abstractfactory.pizzatypes.Pizza;

public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("\nSally Fields ordered a " + pizza.getName() + "\n");
        System.out.println(pizza);


        Pizza pizza2 = chicagoStore.orderPizza("cheese");
        System.out.println("\nRob Reiner ordered a " + pizza2.getName() + "\n");
        System.out.println(pizza2);
    }
}
