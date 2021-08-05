package before.iterator;

public class DinerMenu {
    static final int MAX_ITEMS = 2;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];

        addItem("Hamburger", "plain ol' hamburger", false, 12.99);
        addItem("Falafel wrap", "falafel wrap with garlic tahini", true, 9.99);
    }

    // creates MenuOItems and ensures we haven't hit the menu size limit
    public void addItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);

        if (numberOfItems >= MAX_ITEMS) {
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = menuItem;
            numberOfItems += 1;
        }
    }

    public MenuItem[] getMenuItems() {
        return menuItems;
    }
}
