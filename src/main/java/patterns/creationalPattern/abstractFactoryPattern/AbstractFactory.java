package patterns.creationalPattern.abstractFactoryPattern;

import patterns.creationalPattern.abstractFactoryPattern.bank.Bank;
import patterns.creationalPattern.abstractFactoryPattern.loan.Loan;

public abstract class AbstractFactory {
    public abstract Bank getBank(String bank);
    public abstract Loan getLoan(String loan);
}
