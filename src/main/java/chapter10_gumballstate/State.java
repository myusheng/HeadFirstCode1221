package chapter10_gumballstate;

/**
 * @author MY
 * Date:2019-12-26
 */
public interface State {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

}

