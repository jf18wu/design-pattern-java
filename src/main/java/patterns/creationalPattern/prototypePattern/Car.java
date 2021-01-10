package patterns.creationalPattern.prototypePattern;

public class Car implements Prototype {
    private int doors;
    private int wheels;
    private String brands;

    public Car(int doors, int wheels, String brands) {
        this.doors = doors;
        this.wheels = wheels;
        this.brands = brands;
    }

    public int getDoors() {
        return doors;
    }

    public int getWheels() {
        return wheels;
    }

    public String getBrands() {
        return brands;
    }

    @Override
    public Prototype getClone() {
        return new Car(doors, wheels, brands);
    }
}
