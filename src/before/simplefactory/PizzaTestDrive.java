package before.simplefactory;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
    }

}
