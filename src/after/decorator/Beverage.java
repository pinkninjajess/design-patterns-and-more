package after.decorator;

/**
 * Decorator pattern - attach additional responsibilities to an object dynamically.
 * Decorators provide a flexible alternative to subclassing for extending functionality
 *
 * (Head First Design Patterns)
 */
public abstract class Beverage {

    String description = "Unknown beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
