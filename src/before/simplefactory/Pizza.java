package before.simplefactory;

import java.util.ArrayList;

/**
 * The Product
 */
public abstract class Pizza {
    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    public Pizza() {
    }

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
