package chapter08_barista;

/**
 * @author MY
 * Date:2019-12-25
 */
public abstract class CaffeineBeverageWithHook {

    public void  prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    public abstract void brew();

    public abstract void addCondiments();

    void boilWater() {
        System.out.println("Boiling water");
    }

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    public boolean customerWantsCondiments() {
        return true;
    }
}