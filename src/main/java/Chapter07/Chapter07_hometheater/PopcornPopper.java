/**
 * package Chapter07_hometheater
 * Appearance mode
 */
package Chapter07_hometheater;

/**
 * @author MY
 * Date:2019-12-24
 */
public class PopcornPopper {
	String description;
	
	public PopcornPopper(String description) {
		this.description = description;
	}
 
	public void on() {
		System.out.println(description + " on");
	}
 
	public void off() {
		System.out.println(description + " off");
	}

	public void pop() {
		System.out.println(description + " popping popcorn!");
	}
 
    public String toString() {
        return description;
    }
}

