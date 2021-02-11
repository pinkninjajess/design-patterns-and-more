package after.facade;

public class HomeTheatreTestDrive {
    public static void main(String[] args) {

        // Here we're creating the components right in the test drive
        // Normally the client is given a facade, and doesn't have to construct one itself
        Amplifier amp = new Amplifier();
        Tuner tuner = new Tuner();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheatreLights theatreLights = new TheatreLights();
        PopcornPopper popcornPopper = new PopcornPopper();

        HomeTheatreFacade homeTheatreFacade = new HomeTheatreFacade(amp, tuner, dvdPlayer, cdPlayer, projector, theatreLights,
                screen, popcornPopper);

        homeTheatreFacade.watchMovie("The Little Mermaid");
        homeTheatreFacade.endMovie();

    }

}
