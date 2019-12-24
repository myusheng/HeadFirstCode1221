/**
 * package Chapter07_hometheater
 * Appearance mode
 */
package Chapter07_hometheater;

/**
 * @author MY
 * Date:2019-12-24
 */
public class Tuner {
	String description;
	Amplifier amplifier;
	double frequency;
	
	public Tuner(String description, Amplifier amplifier) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}
	
	public void setAm() {
		System.out.println(description + " setting AM mode");
	}
	
	public void setFm() {
		System.out.println(description + " setting FM mode");
	}
 
	public void setFrequency(double frequency) {
		System.out.println(description + " setting frequency to " + frequency);
		this.frequency = frequency;
	}
  
    public String toString() {
                return description;
    }
}

