package Singleton;

public class SingletonDriver {
    private static Singleton instance2;

    public static void main(String[] args) {
//
//        Singleton instance1 = Singleton.getInstance();
//        Singleton instance2 = Singleton.getInstance();
//        System.out.println(instance1 == instance2);

//        Singleton singleton = new Singleton();

//        Thread Safe Singleton =>>>
        ThreadSafeSingleton threadSafeInstance1 = ThreadSafeSingleton.getThreadSafeSingleInstance();
        ThreadSafeSingleton threadSafeInstance2 = ThreadSafeSingleton.getThreadSafeSingleInstance();
        System.out.println(threadSafeInstance1 == threadSafeInstance2);
    }

}
