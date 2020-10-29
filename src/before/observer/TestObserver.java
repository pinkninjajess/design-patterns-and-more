package before.observer;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestObserver {

    @Test
    public void setNews() {
       NewsAgency observable = new NewsAgency();

       observable.setNews("news");
       assertEquals(observable.getCbcNewsChannel().getNews(), "news");
    }
}
