package before.templatemethod;

/**
 * Negative points about this implementation
 * - Coffee and Tea each control their own algorithms
 * - Code duplication across Coffee and Tea
 * - Adding a new Caffeine Beverage is a lot more work this way
 */
public class BeverageTaster {
    public static void main(String[] args) {
        Tea tea = new Tea();
        Coffee coffee = new Coffee();

        System.out.println("Making a tea...");
        tea.prepareRecipe();

        System.out.println("\n\nMaking a coffee...");
        coffee.prepareRecipe();
    }
}
