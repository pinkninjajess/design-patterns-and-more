package after.iterator;

public class RestaurantRunner {
    public static void main(String[] args) {
        Menu dinnerMenu = new DinerMenu();
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinnerMenu);

        waitress.printMenu();
    }
}
