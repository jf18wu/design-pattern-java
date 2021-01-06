package patterns.creationalPattern.abstractFactoryPattern.loan;

public abstract class Loan {
    protected double rate;

    public double calculateEMI(double mount, int years) {
        int n = years * 12;

        return ((rate * Math.pow((1 + rate), n))
                / ((Math.pow((1 + rate), n)) - 1)) * mount;
    }
}
