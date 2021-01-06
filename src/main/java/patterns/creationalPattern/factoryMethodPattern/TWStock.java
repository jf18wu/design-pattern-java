package patterns.creationalPattern.factoryMethodPattern;

public class TWStock extends Stock {
    @Override
    void getPrice() {
        this.price = 1.0;
    }
}
