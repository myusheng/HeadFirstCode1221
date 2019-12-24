/**
 * package chapter07.hometheater
 * Appearance mode
 */
package chapter07.hometheater;

/**
 * @author MY
 * Date:2019-12-24
 */
public class Screen {
	String description;
	
	public Screen(String description) {
		this.description = description;
	}
 
	public void up() {
		System.out.println(description + " going up");
	}
 
	public void down() {
		System.out.println(description + " going down");
	}
  
    public String toString() {
        return description;
    }
}
