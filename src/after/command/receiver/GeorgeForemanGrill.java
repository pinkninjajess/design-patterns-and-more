package after.command.receiver;

/**
 * Receiver
 */
public class GeorgeForemanGrill {

    String location;

    public GeorgeForemanGrill(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " George Foreman Grill has been turned on and is cooking bacon...");
    }

    public void off() {
        System.out.println(location + " George Foreman Grill has been turned off.  Bacon and foot are now cooked!");
    }
}
