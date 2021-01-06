package patterns.creationalPattern.abstractFactoryPattern.bank;

public class Yuan implements Bank {
    private String name;

    public Yuan() {
        this.name = "YUAN";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
