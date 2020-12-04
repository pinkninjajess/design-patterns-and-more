package after.factorymethod.pizzatypes;


import java.util.ArrayList;

/**
 * Product
 * - all products must implement the same interface so that
 * the classes that use the products can refer to the interface, not the concrete class
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public String getName() {
        return this.name;
    }

    public void prepare() {
        System.out.println("Preparing " + this.name);
    }

    public void bake() {
        System.out.println("Baking " + this.name);
    }

    public void cut() {
        System.out.println("Cutting " + this.name);
    }

    public void box() {
        System.out.println("Boxing " + this.name);
    }

    public String toString() {
        StringBuffer display = new StringBuffer();
        display.append("---- " + this.name + " ----\n");
        display.append(this.dough + "\n");
        display.append(this.sauce + "\n");

        for(int i = 0; i < this.toppings.size(); ++i) {
            display.append((String)this.toppings.get(i) + "\n");
        }

        return display.toString();
    }
}
