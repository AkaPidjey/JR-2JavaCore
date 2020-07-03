package Level_04.Task_1408;

public class BelarusianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 400;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна - " + BELARUS + "." + " Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
