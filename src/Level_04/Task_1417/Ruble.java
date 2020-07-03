package Level_04.Task_1417;

public class Ruble extends Money {
    @Override
    public String getCurrencyName() {
        return "RUB";
    }
    public Ruble(double amount) {
        super(amount);
    }
}
