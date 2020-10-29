package before.observer;

import after.observerdiy.Observer;

public class NewsAgency {

    private String news;

    CNNNewsChannel cnnNewsChannel = new CNNNewsChannel();
    CBCNewsChannel cbcNewsChannel = new CBCNewsChannel();

    public void setNews(String news) {
        this.news = news;

        /**
         * by coding to concrete implementations, we have no way to add or remove other channels\
         * without making changes to the program
         * also, the following is subject to easily, change so it should be encapsulated
         * (Head First Design Patterns)
         */
        cnnNewsChannel.setNews(news);
        cbcNewsChannel.setNews(news);
    }

    public CBCNewsChannel getCbcNewsChannel() {
        return this.cbcNewsChannel;
    }

}
