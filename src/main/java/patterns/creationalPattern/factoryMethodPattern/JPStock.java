package patterns.creationalPattern.factoryMethodPattern;

public class JPStock extends Stock {
    @Override
    void getPrice() {
        price = 3.0;
    }
}
