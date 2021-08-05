package before.iterator;

import java.util.ArrayList;

public class Waitress {
    PancakeHouseMenu pancakeHouseMenu;
    DinerMenu dinerMenu;

    public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinnerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinnerMenu;
    }

    /**
     * Uses two different loops, which is bulky -> this can be improved
     */
    public void printMenu() {
        ArrayList<MenuItem> breakfastItems = pancakeHouseMenu.getMenuItems();
        MenuItem[] dinnerItems = dinerMenu.getMenuItems();
        MenuItem menuItem;

        System.out.println("======Breakfast======");
        for (int i = 0; i < breakfastItems.size(); i++) {
            menuItem = breakfastItems.get(i);
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
            System.out.println("-----------------------");
        }
        System.out.println("======Dinner======");
        for (int i = 0; i < dinnerItems.length; i++) {
            menuItem = dinnerItems[i];
            System.out.println(menuItem.getName() + " ");
            System.out.println(menuItem.getPrice() + " ");
            System.out.println(menuItem.getDescription() + " ");
            System.out.println("-----------------------");
        }

    }

}
