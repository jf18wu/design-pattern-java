package patterns.creationalPattern.abstractFactoryPattern.bank;

public class Tai implements Bank {
    private String name;

    public Tai() {
        this.name = "TAI";
    }

    @Override
    public String getBankName() {
        return name;
    }
}
