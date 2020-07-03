package Level_04.Task_1408;

public class UkrainianHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 200;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна - " + UKRAINE + "." + " Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
