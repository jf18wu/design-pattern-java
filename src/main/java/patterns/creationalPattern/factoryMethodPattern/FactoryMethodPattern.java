package patterns.creationalPattern.factoryMethodPattern;

public class FactoryMethodPattern {
    public Stock getStock(String stockType) {
        if (stockType == null) {
            return null;
        }

        if (stockType.equalsIgnoreCase("TWSTOCK")) {
            return new TWStock();
        } else if (stockType.equalsIgnoreCase("JPSTOCK")) {
            return new JPStock();
        } else if (stockType.equalsIgnoreCase("USSTOCK")) {
            return new USStock();
        } else {
            throw new RuntimeException("Type not available");
        }
    }

}
