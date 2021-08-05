package before.iterator;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<MenuItem>();

        addItem("Pancake Breakfast", "Pancakes with fresh fruit",
                true, 2.99);

        addItem("Açai Bowl", "Açai bowl with peanut butter and chocolate chips",
                true, 12.00);

        addItem("Waffles", "Waffles with Amber Canadian maple syrup",
                true, 9.99);
    }

    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menuItems.add(menuItem);
    }

    public ArrayList<MenuItem> getMenuItems() {
        return (ArrayList<MenuItem>) menuItems;
    }
}
