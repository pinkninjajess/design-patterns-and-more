package after.iterator;

import java.util.Iterator;

public class Waitress {
    Menu pancakeHouseMenu;
    Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinnerMenu;
    }

    /**
     * The Menus are now well encapsulated - the waitress doesn't need to know the type of collection it uses
     * and is no longer stuck uses concrete classes (MenuItem[] and ArrayList) - but is now using an Interface-> Iterator
     */
    public void printMenu() {
        Iterator<MenuItem> pancakeIterator = pancakeHouseMenu.createIterator();
        Iterator<MenuItem> dinerIterator = dinerMenu.createIterator();

        System.out.println("======Breakfast======");
        printMenu(pancakeIterator);

        System.out.println("======Dinner======");
        printMenu(dinerIterator);
    }

    private void printMenu(Iterator<MenuItem> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = iterator.next();
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
            System.out.println("-----------------------");
        }
    }

}
