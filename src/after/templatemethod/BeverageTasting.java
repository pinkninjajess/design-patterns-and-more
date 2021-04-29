package after.templatemethod;

public class BeverageTasting {
    public static void main(String[] args) {

        /**
         * We are now able to depend on the CaffeineBeverage abstraction rather than the concrete Coffee and Tea classes
         *
         * Advantages of Abstraction
         *     It reduces the complexity of viewing the things.
         *     Avoids code duplication and increases reusability.
         *     Helps to increase security of an application or program as only important details are provided to the user.
         *
         *     Source: https://www.geeksforgeeks.org/abstraction-in-java-2/
         */
        CaffeineBeverage coffee = new Coffee();
        CaffeineBeverage tea = new Tea();

        System.out.println("Making a tea...");
        tea.prepareRecipe();

        System.out.println("\n\nMaking a coffee...");
        coffee.prepareRecipe();
    }
}
