package after.facade;

public class DvdPlayer {
    public void on() {
        System.out.println("DVD player - turning on");
    }

    public void play(String movie) {
        System.out.println("DVD player playing " + movie);
    }

    public void stop() {
        System.out.println("DVD player - stop movie");
    }

    public void eject() {
        System.out.println("DVD player - eject movie");
    }

    public void off() {
        System.out.println("DVD player - off");
    }
}
