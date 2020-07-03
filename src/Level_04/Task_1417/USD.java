package Level_04.Task_1417;

public class USD extends Money {
    @Override
    public String getCurrencyName() {
        return "USD";
    }
    public USD(double amount) {
        super(amount);
    }
}
