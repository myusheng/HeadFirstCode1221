/**
 * package chapter07.hometheater
 * Appearance mode
 */
package chapter07.hometheater;

/**
 * @author MY
 * Date:2019-12-24
 */
public class Amplifier {
	public String description;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	
	public Amplifier(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
	
	public void setCd(CdPlayer cdPlayer) {
		System.out.println(description + " setting CD player to " + cdPlayer);
		this.cdPlayer = cdPlayer;
	}
	
	public void setDvd(DvdPlayer dvdPlayer) {
		System.out.println(description + " setting DVD player to " + dvdPlayer);
		this.dvdPlayer = dvdPlayer;
	}
 
	public void setStereoSound() {
		System.out.println(description + " stereo mode on");
	}
 
	public void setSurroundSound() {
		System.out.println(description + " surround sound on (5 speakers, 1 subwoofer)");
	}
	
	public void setTuner(Tuner tuner) {
		System.out.println(description + " setting tuner to " + dvdPlayer);
		this.tuner = tuner;
	}
 
	public void setVolume(int level) {
		System.out.println(description + " setting volume to " + level);
	}

	public String toString() {
		return description;
	}
}
