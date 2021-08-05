package after.iterator;

import java.util.Iterator;

/**
 * The Iterator Pattern
 * lets you access the properties of an object that is an aggregate (i.e., type of collection)
 * without showing you how it all works
 * <p>
 * Instead of putting this code within PancakeHouseMenu, we are separating it out,
 * because each class should have only one responsibility (and therefore one reason to change)
 * ---> The Single Responsibility Principle
 * <p>
 * Cohesion is also related to the Single Responsibility Principle
 * --- a class has high cohesion when its functions are related / not trying to do too much at once
 * --- classes that have high cohesion are easier to maintain than classes that have low cohesion and are taking on
 * too many tasks
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    @Override
    public boolean hasNext() {
        return position < items.length && items[position] != null;
    }

    public void remove() {
        throw new UnsupportedOperationException("Don't try to delete menu items!");
    }
}
