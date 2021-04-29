package after.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This subclass is used to simply provide implementation details (for brewing and condiments)
 * <p>
 * Coffee never calls the abstract class without being called first, an example of the Hollywood Principle
 * "Don't call us, we'll call you"
 */
public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Brewing coffee grinds");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding milk and sugar, mjam!");
    }

    public boolean customerWantsCondiments() {
        String answer = getUserInput();

        return answer.toLowerCase().startsWith("y");
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Would you like milk and sugar with your coffee? (y/n)");

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            answer = in.readLine();
        } catch (IOException e) {
            System.err.println("IO error occurred with your answer, sorry!");
        }
        if (answer == null) {
            return "no";
        }
        return answer;
    }
}
