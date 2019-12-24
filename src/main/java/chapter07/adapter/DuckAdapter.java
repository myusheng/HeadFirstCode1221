package chapter07.adapter;

import java.util.Random;

/**
 * @author MY
 * Date:2019-12-24
 */
public class DuckAdapter implements Turkey {
    private Duck duck;
    private Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        this.rand = new Random();
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        // 因为鸭子更会飞，所以让鸭子平均五次飞一次
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}