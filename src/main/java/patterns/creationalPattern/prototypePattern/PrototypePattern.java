package patterns.creationalPattern.prototypePattern;

public class PrototypePattern {
    public Car instanceA;
    public Car instanceB;

    public PrototypePattern() {
        instanceA = new Car(4, 4, "BMX");
        instanceB = (Car) instanceA.getClone();
    }
}
