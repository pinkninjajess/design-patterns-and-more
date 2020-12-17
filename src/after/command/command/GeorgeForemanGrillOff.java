package after.command.command;

import after.command.receiver.GeorgeForemanGrill;

public class GeorgeForemanGrillOff implements Command {
    GeorgeForemanGrill georgeForemanGrill;

    public GeorgeForemanGrillOff(GeorgeForemanGrill georgeForemanGrill) {
        this.georgeForemanGrill = georgeForemanGrill;
    }

    @Override
    public void execute() {
        georgeForemanGrill.off();
    }
}
