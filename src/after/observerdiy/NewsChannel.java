package after.observerdiy;

public class NewsChannel implements Observer {
    private String news;
    private Observable observable;

    public NewsChannel(Observable o) {
        this.observable = o;
        this.observable.addObserver(this);
    }

    @Override
    public void update(Object news) {
        this.setNews((String) news);
    }

    public void setNews(String news) {
        this.news = news;
    }

    public String getNews() {
        return this.news;
    }
}
