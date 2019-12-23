package Chapter06_undo;

public interface Command {
	public void execute();
	public void undo();
}