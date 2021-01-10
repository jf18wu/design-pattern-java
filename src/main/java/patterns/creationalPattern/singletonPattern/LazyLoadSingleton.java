package patterns.creationalPattern.singletonPattern;

public class LazyLoadSingleton {
    private static LazyLoadSingleton singleton;

    private LazyLoadSingleton() {}

    public static LazyLoadSingleton getInstance() {
        if (singleton == null) {
            synchronized (LazyLoadSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyLoadSingleton();
                }
            }
        }
        return singleton;
    }
}
