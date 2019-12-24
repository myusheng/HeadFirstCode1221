package Chapter06_remote;

public class CeilingFanOffCommand implements Command {
	CeilingFan ceilingFan;
	public CeilingFanOffCommand (CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}
	
	@Override
	public void execute() {
		ceilingFan.off();
	}
}
