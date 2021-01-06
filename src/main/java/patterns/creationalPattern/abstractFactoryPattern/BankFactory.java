package patterns.creationalPattern.abstractFactoryPattern;

import patterns.creationalPattern.abstractFactoryPattern.bank.Bank;
import patterns.creationalPattern.abstractFactoryPattern.bank.Tai;
import patterns.creationalPattern.abstractFactoryPattern.bank.Yuan;
import patterns.creationalPattern.abstractFactoryPattern.loan.Loan;

public class BankFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        if (bank == null) {
            return null;
        }

        if (bank.equalsIgnoreCase("TAI")) {
            return new Tai();
        } else if (bank.equalsIgnoreCase("YUAN")) {
            return new Yuan();
        }

        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        return null;
    }
}
