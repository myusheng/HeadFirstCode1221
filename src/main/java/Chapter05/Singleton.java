package Chapter05;

//node: This is not thread safe!

public class Singleton {
    private static Singleton uniqueInstance;
    // other useful instance
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    // other useful methods
}
