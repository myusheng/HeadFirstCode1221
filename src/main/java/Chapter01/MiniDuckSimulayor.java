package Chapter01;

public class MiniDuckSimulayor {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
