/**
 * package Chapter07_hometheater
 * Appearance mode
 */
package Chapter07_hometheater;

/**
 * @author MY
 * Date:2019-12-24
 */
public class TheaterLights {
	String description;
	
	public TheaterLights(String description) {
		this.description = description;
	}
  
	public void on() {
		System.out.println(description + " on");
	}
  
	public void off() {
		System.out.println(description + " off");
	}
  
	public void dim(int level) {
		System.out.println(description + " dimming to " + level  + "%");
	}
   
    public String toString() {
        return description;
    }
}

