package patterns.creationalPattern.factoryMethodPattern;

public class USStock extends Stock {
    @Override
    void getPrice() {
        price = 30.0;
    }
}
