package after.observerdiy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestObserver {

    @Test
    public void setNews() {
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel(observable);

        observable.setNews("news");
        assertEquals(observer.getNews(), "news");
    }
}
