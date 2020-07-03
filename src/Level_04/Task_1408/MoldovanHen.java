package Level_04.Task_1408;

public class MoldovanHen extends Hen implements Country {
    @Override
    int getCountOfEggsPerMonth() {
        return 300;
    }

    @Override
    String getDescription() {
        return super.getDescription() +  " Моя страна - " + MOLDOVA + "." + " Я несу " + this.getCountOfEggsPerMonth() +" яиц в месяц.";
    }
}
