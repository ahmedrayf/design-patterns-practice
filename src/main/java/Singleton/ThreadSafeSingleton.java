package Singleton;

public class ThreadSafeSingleton {
    private ThreadSafeSingleton(){}
    private static volatile ThreadSafeSingleton threadSafeSingleInstance;

    public static ThreadSafeSingleton getThreadSafeSingleInstance() {
        if (threadSafeSingleInstance == null){
            synchronized (ThreadSafeSingleton.class){
                if (threadSafeSingleInstance == null)
                    threadSafeSingleInstance = new ThreadSafeSingleton();
            }
        }
        return threadSafeSingleInstance;
    }
}
