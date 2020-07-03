package Level_04.Task_1408;

public class RussianHen extends Hen implements Country{
    @Override
    int getCountOfEggsPerMonth() {
        return 100;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна - " + RUSSIA + ". Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
