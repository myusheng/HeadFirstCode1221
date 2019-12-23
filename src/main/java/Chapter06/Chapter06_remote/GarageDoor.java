package Chapter06_remote;

public class GarageDoor {
	String location;
	public GarageDoor(String location) {
		this.location = location;
		
	}
	
	public void up() {
		System.out.println("GarageDoor is open");
	}
	public void down() {
		System.out.println("GarageDoor is closed");
	}
	public void stop() {
		System.out.println("GarageDoor is stopped");
	}
	public void lightOn() {
		System.out.println("Garage light is on");
	}
	public void lightOff() {
		System.out.println("Garage light is off");
	}

}
