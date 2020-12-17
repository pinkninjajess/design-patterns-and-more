package after.command;

public class Light {
    String location;
    public static final int OFF = 0;
    public static final int ON = 1;
    int status;

    public Light(String location) {
        this.location = location;
    }

    public void on() {
        status = ON;
        System.out.println(location + " light is on");
    }

    public void off() {
        status = OFF;
        System.out.println(location + " light is off");
    }
}
