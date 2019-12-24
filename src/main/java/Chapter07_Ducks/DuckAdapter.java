/**
 * Adapter mode
 */
package Chapter07_Ducks;

import java.util.Random;

/**
 * @author MY
 * Date:2019-12-24
 */
public class DuckAdapter implements Turkey {
	Duck duck;
	Random rand;

	public DuckAdapter(Duck duck) {
		this.duck = duck;
		rand = new Random();
	}

	public void gobble() {
		duck.quack();
   	}
	
	//因为鸭子更会飞，所以让鸭子平均五次飞一次
	public void fly() {
		if (rand.nextInt(5) == 0) {
			duck.fly();
		}
	}
}