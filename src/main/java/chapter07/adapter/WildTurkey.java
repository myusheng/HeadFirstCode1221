package chapter07.adapter;

/**
 * @author MY
 * Date:2019-12-24
 */
public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("Gobble gobble~~");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}
