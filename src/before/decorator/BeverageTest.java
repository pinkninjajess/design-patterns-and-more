package before.decorator;

import org.junit.Assert;
import org.junit.Test;

public class BeverageTest {

    @Test
    public void getDarkRoast() {
        Beverage darkRoast = new DarkRoast();
        darkRoast.setWhip(true);
        darkRoast.setMilk(true);
        Assert.assertEquals(darkRoast.cost(), 2.34, 0.f);
    }

}
