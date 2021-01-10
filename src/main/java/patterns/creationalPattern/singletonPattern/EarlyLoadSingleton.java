package patterns.creationalPattern.singletonPattern;

public class EarlyLoadSingleton {
    private static EarlyLoadSingleton singleton = new EarlyLoadSingleton();

    private EarlyLoadSingleton() {}

    public static EarlyLoadSingleton getInstance() {
        return singleton;
    }
}
