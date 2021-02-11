package after.facade;

public class Amplifier {
    public void on() {
        System.out.println("Amp - on");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println("Amp - connecting to DVD player");
    }

    public void setSurroundSound() {
        System.out.println("Amp - turning on surround sound");
    }

    public void setVolume(int i) {
        System.out.println("Amp - setting volume to level " + i);
    }

    public void off() {
        System.out.println("Amp - off");
    }

    @Override
    public String toString() {
        return "awesome DVD player";
    }
}
