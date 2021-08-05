package before.iterator;

public class RestaurantRunner {
    public static void main(String[] args) {
        DinerMenu dinnerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

        waitress.printMenu();
    }
}
