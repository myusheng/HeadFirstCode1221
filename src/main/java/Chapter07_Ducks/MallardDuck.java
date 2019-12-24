/**
 * Adapter mode
 */
package Chapter07_Ducks;

/**
 * @author MY
 * Date:2019-12-24
 */
public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("Quak");
	}
	
	@Override
	public void fly() {
		System.out.println("I'm flying");
	}
}
