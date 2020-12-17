package after.command.command;

/**
 * The command object encapsulates a request by binding together a set of actions on a specific receiver
 *  - to achieve this, it packages the actions and the receiver up into object that exposes just one
 *  method, execute()
 */
public interface Command {
    void execute();
}
