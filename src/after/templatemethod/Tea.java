package after.templatemethod;

/**
 * This subclass is used to simply provide implementation details (for brewing and condiments)
 */
public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping tea");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding lemon");
    }
}
