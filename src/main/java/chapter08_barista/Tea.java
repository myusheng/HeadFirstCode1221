package chapter08_barista;

/**
 * @author MY
 * Date:2019-12-25
 */
public class Tea extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }
    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

