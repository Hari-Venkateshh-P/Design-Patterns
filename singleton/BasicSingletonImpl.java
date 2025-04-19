package singleton;

public class BasicSingletonImpl {
    public static void main(String[] args) {
        // Throws Error since default constructor is made into private
        // BasicSingleton x = new BasicSingleton();
        // BasicSingleton y = new BasicSingleton();

        BasicSingleton x = BasicSingleton.getInstance();
        BasicSingleton y = BasicSingleton.getInstance();

        System.out.println(String.format("Hascode of Obj X %s", x.hashCode()));
        System.out.println(String.format("Hascode of Obj Y %s", y.hashCode()));
        System.out.println(String.format("Are both objects same: %s", x == y));


    }
}

class BasicSingleton {

    public static BasicSingleton instance;

    private BasicSingleton() {

    }

    public static BasicSingleton getInstance() {
        if (instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }
}
