package after.command.receiver;

public class GarageDoor {
    String location;

    public GarageDoor(String location) {
        this.location = location;
    }

    public void down() {
        System.out.println(location + " garage door is down");
    }

    public void up() {
        System.out.println(location + " garage door is up");
    }
}
