package after.observerdiy;

import java.util.ArrayList;
import java.util.List;

/**
 * The Observer Pattern provides an object design where subjects (observables) and observers are loosely coupled
 * - the only thing we know about an observer, is that it implements a certain kind of interface (Observer)
 * - we can add new observers at any time (or remove them, because the Subject only depends on a list of objects that
 *  implement the Observer interface)
 *  - We never need to modify the subject to add new types of observers
 *  - We can reuse subjects or observers independently of each other
 *  - Changes to either the subject or an observer will not affect the other
 *
 *  (Head First Design Patterns)
 */
public class NewsAgency implements Observable {
    private String news;
    private List<Observer> channels;

    public NewsAgency() {
        this.channels = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer channel) {
        this.channels.add(channel);
    }

    @Override
    public void removeObserver(Observer channel) {
        this.channels.remove(channel);
    }

    public void setNews(String news) {
        this.news = news;
        for(Observer channel: this.channels) {
            channel.update(this.news);
        }
    }

    public String getNews() {
        return news;
    }
}
