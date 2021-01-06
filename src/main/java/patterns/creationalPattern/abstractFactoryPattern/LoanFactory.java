package patterns.creationalPattern.abstractFactoryPattern;

import patterns.creationalPattern.abstractFactoryPattern.bank.Bank;
import patterns.creationalPattern.abstractFactoryPattern.bank.Tai;
import patterns.creationalPattern.abstractFactoryPattern.bank.Yuan;
import patterns.creationalPattern.abstractFactoryPattern.loan.EduLoan;
import patterns.creationalPattern.abstractFactoryPattern.loan.HouseLoan;
import patterns.creationalPattern.abstractFactoryPattern.loan.Loan;

public class LoanFactory extends AbstractFactory {
    @Override
    public Bank getBank(String bank) {
        return null;
    }

    @Override
    public Loan getLoan(String loan) {
        if (loan == null) {
            return null;
        }

        if (loan.equalsIgnoreCase("EDU")) {
            return new EduLoan();
        } else if (loan.equalsIgnoreCase("HOUSE")) {
            return new HouseLoan();
        }

        return null;
    }
}
