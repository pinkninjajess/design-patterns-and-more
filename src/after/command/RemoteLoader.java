package after.command;

import after.command.command.Command;
import after.command.command.GeorgeForemanGrillOff;
import after.command.command.GeorgeForemanGrillOn;
import after.command.receiver.*;

/**
 * The client
 * - is responsible for creating the command object
 * - does a setCommand() to store the command object in the invoker (the remote control slot)
 * - later, the client asks the invoker to execute the command
 */
public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        /**
         * The Receiver
         */
        GeorgeForemanGrill georgeForemanGrill = new GeorgeForemanGrill("Bedroom");


        /**
         * The command object encapsulates a request by binding together a set of actions on a specific receiver
         *  - to achieve this, it packages the actions and the receiver up into object that exposes just one
         *  method, execute()
         */
        Command georgeForeManGrillOn = new GeorgeForemanGrillOn(georgeForemanGrill);
        Command georgeForemanGrillOff = new GeorgeForemanGrillOff(georgeForemanGrill);

        remoteControl.setCommand(0, georgeForeManGrillOn, georgeForemanGrillOff);

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Main house");
        Stereo stereo = new Stereo("Living Room");

        /**
         * Here we are using method references rather than creating concrete Command objects
         * A method reference is like a compact lambda expression
         * They're really the same thing; a method reference is just shorthand for a lambda expression that calls just one method
         */
        remoteControl.setCommand(1, livingRoomLight::on, livingRoomLight::off);
        remoteControl.setCommand(2, kitchenLight::on, kitchenLight::off);
        remoteControl.setCommand(3, ceilingFan::high, ceilingFan::off);


        /**
         * We can use a lambda expression to stand in for Command objects - which use a functional interface (just one method):
         *  i.e., the execute() method
         * The lambda expression must have a compatible signature with this method
         *  it does - like execute() it takes no arguments and returns no value
         */
        Command stereoOnWithCD = () -> {
            stereo.on(); stereo.setCD(); stereo.setVolume(11);
        };

        remoteControl.setCommand(4, stereoOnWithCD, stereo::off);
        remoteControl.setCommand(5, garageDoor::up, garageDoor::down);

        System.out.println(remoteControl);
        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
        remoteControl.onButtonWasPushed(4);
        remoteControl.offButtonWasPushed(4);
        remoteControl.onButtonWasPushed(5);
        remoteControl.offButtonWasPushed(5);
    }
}
