package patterns.creationalPattern.factoryMethodPattern;

public abstract class Stock {
    protected double price;
    abstract void getPrice();

    public double calculateValue(double units) {
        System.out.println(units * price);
        return units * price;
    }
}
