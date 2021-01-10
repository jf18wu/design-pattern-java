package patterns.creationalPattern.singletonPattern;

import java.io.Serializable;

public class SerializationSingleton implements Serializable {
    private static SerializationSingleton singleton = new SerializationSingleton();

    private SerializationSingleton() {}

    public static SerializationSingleton getInstance() {
        return singleton;
    }

    protected Object readResolve() {
        return getInstance();
    }
}
