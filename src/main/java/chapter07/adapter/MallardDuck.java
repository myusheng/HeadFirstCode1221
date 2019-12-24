package chapter07.adapter;

/**
 * Adapter mode
 *
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
