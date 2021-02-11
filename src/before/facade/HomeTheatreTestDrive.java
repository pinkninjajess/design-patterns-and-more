package before.facade;

import after.facade.*;

public class HomeTheatreTestDrive {
    public static void main(String[] args) {

        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatreLights theatreLights = new TheatreLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        System.out.println("Get ready to watch a movie... ");
        popcornPopper.on();
        popcornPopper.pop();
        theatreLights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvdPlayer);
        amp.setSurroundSound();
        amp.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play("The Little Mermaid");
        System.out.println("==========================");


        System.out.println("\nShutting movie theatre down...good times were had, and now it's closing time");
        popcornPopper.off();
        theatreLights.on();
        screen.up();
        projector.off();
        amp.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
