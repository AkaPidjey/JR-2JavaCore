package Level_04.Task_1417;

public class Hrivna extends Money {
    @Override
    public String getCurrencyName() {
        return "UAH";
    }
    public Hrivna(double amount) {
        super(amount);
    }
}
