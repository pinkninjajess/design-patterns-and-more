package before.decorator;

/**
 * Downsides of this implementation:
 *  - price changes for condiments will force us to alter existing code
 *  - new condiments will force us to add new methods and alter the cost method in the superclass
 *  - we may have new beverages (eg., iced tea) for which the condiments may not be appropriate,
 *      but they would still inherit hasWhip()
 *  - not possible to have a double mocha
 *
 * (Head First Design Patterns)
 */
public class Beverage {

    String description;
    boolean milk;
    boolean mocha;
    boolean whip;
    boolean soy;

    double milkCost = 0.10;
    double soyCost = 0.50;
    double mochaCost = 1.00;
    double whipCost = 0.25;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public boolean hasWhip() {
        return whip;
    }

    public boolean hasSoy() {
        return soy;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public double cost() {
        double condimentCost = 0.0;

        if(hasMilk()) {
            condimentCost += milkCost;
        }
        if (hasSoy()) {
            condimentCost += soyCost;
        }
        if (hasMocha()) {
            condimentCost += mochaCost;
        }
        if (hasWhip()) {
            condimentCost += whipCost;
        }

        return condimentCost;
    }
}
