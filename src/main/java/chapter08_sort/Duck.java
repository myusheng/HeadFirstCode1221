package chapter08_sort;

/**
 * @author MY
 * Date:2019-12-25
 */
public class Duck implements Comparable {
    public String name;
    public int weight;

    public Duck(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return  name + "weights " + weight;
    }

    @Override
    public int compareTo(Object object) {
        Duck otherDuck = (Duck)object;

        if (this.weight < otherDuck.weight) {
            return -1;
        } else if (this.weight == otherDuck.weight) {
            return 0;
        }else {
            return 1;
        }
    }
}
