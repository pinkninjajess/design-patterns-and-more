package before.templatemethod;

public class Coffee {

    void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void brewCoffeeGrinds() {
        System.out.println("Brewing coffee grinds");
    }

    private void boilWater() {
        System.out.println("Boiling water");
    }

    private void addSugarAndMilk() {
        System.out.println("Adding sugar and milk, mjam!");
    }
}
