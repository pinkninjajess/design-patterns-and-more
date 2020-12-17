package after.command.command;

import after.command.receiver.GeorgeForemanGrill;

public class GeorgeForemanGrillOn implements Command{
    public GeorgeForemanGrillOn(GeorgeForemanGrill georgeForemanGrill) {
        this.georgeForemanGrill = georgeForemanGrill;
    }

    GeorgeForemanGrill georgeForemanGrill;

    @Override
    public void execute() {
        georgeForemanGrill.on();
    }
}
