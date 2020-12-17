package after.command;

import after.command.command.Command;
import after.command.command.NoCommand;

/**
 * Invoker
 * makes a request of a Command object by calling its execute() method, which invokes those actions on the receiver
 * (each slot of the remote is considered to be an invoker)
 */
public class RemoteControl {

    /**
     * Only relies on an Object that implements the Command interface,
     * which decouples the RemoteControl Slot (the Invoker) from the receiver of the request (e.g, GeorgeForemanGrill)
     */
    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        for (int i=0; i < 7; i++) {

            onCommands[i] = new NoCommand();

            /**
             * Rather than use a NoCommand object, we can use a lambda expression that does nothing
             * (Just like the execute() method of the NoCommand object did nothing)
             */
            offCommands[i] = () -> {};
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        offCommands[slot] = offCommand;
        onCommands[slot] = onCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n------ Remote Control ------\n");
        for (int i=0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "] " + onCommands[i].getClass().getName()
            + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuffer.toString();
    }
}
