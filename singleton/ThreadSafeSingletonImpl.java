package singleton;

public class ThreadSafeSingletonImpl {
    public static void main(String[] args) {
        Runnable notitifcationServiceTask = new Runnable() {
            public void run() {
                ThreadSafeSingleton instance = ThreadSafeSingleton.getInstance();
                System.out.println(String.format("Hascode of instance : %s", instance.hashCode()));
            }
        };

        Thread threadX = new Thread(notitifcationServiceTask, "THREAD 1");
        Thread threadY = new Thread(notitifcationServiceTask, "THREAD 2");

        threadX.start();
        threadY.start();
    }
}

class ThreadSafeSingleton {

    public static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {

    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    public static  ThreadSafeSingleton getInstanceEfficient() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                } 
            }
        }
        return instance;
    }
}
