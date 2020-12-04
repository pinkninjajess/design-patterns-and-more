package after.abstractfactory.pizzatypes;


import after.abstractfactory.ingredients.*;

import java.util.ArrayList;

/**
 * Product
 * - all products must implement the same interface so that
 * the classes that use the products can refer to the interface, not the concrete class
 */
public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;
    Veggies[] veggies;
    Clams clam;

    public abstract void prepare();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting " + this.name);
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("---- " + name + " ----\n");
        if (dough != null) {
            result.append(dough);
            result.append("\n");
        }
        if (sauce != null) {
            result.append(sauce);
            result.append("\n");
        }
        if (cheese != null) {
            result.append(cheese);
            result.append("\n");
        }
        if (veggies != null) {
            for (int i = 0; i < veggies.length; i++) {
                result.append(veggies[i]);
                if (i < veggies.length-1) {
                    result.append(", ");
                }
            }
            result.append("\n");
        }
        if (clam != null) {
            result.append(clam);
            result.append("\n");
        }
        if (pepperoni != null) {
            result.append(pepperoni);
            result.append("\n");
        }
        return result.toString();
    }
}
