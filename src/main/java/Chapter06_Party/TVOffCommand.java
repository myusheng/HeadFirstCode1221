package Chapter06_Party;

public class TVOffCommand implements Command {
	TV tv;

	public TVOffCommand(TV tv) {
		this.tv= tv;
	}
	
	@Override
	public void execute() {
		tv.off();
	}
}
