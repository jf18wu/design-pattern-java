package patterns.creationalPattern.abstractFactoryPattern;

public class FactoryCreator {
    public static AbstractFactory getFactory(String factory) {
        if (factory.equalsIgnoreCase("BANK")) {
            return new BankFactory();
        } else if (factory.equalsIgnoreCase("LOAN")) {
            return new LoanFactory();
        }

        return null;
    }
}
