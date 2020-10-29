package before.decorator;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Most excellent Dark Roast";
    }

    @Override
    public double cost() {
        return 1.99 + super.cost();
    }
}
