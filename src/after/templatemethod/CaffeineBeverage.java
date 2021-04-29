package after.templatemethod;

/**
 * Our high level component.
 * It has control over the algorithm for the recipe, and calls on the subclasses
 * only when they're needed for an implementation of a method
 * <p>
 * Benefits
 * - The CaffeineBeverage holds the algorithm and protects it
 * - The CaffeineBeverage maximizes reuse among the subclasses
 * - New caffeine beverages only need to implement a couple of methods
 */
public abstract class CaffeineBeverage {

    /**
     * The template method
     * - must be declared final, so that it cannot be overridden
     * - a template for an algorithm (a sequence of steps/instructions intended to achieve a larger task,
     * i.e., a caffeinated beverage)
     * - each step of the algorithm is represented by a method
     * - either a method in this class or in a subclass
     */
    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    /**
     * This is a hook method
     * It can be overridden by the subclasses to customize behaviour
     */
    boolean customerWantsCondiments() {
        return true;
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Methods that need to be implemented by the subclass are declared as abstract
     */
    abstract void brew();

    abstract void addCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

}
