package after.command;

public class Stereo {
    String location;
    int volume = 0;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setVolume(int i) {
        volume = i;
        System.out.println(location + " stereo volume is set to " + volume);
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }
}
