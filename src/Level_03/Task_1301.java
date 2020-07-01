package Level_03;

/**
 * Title - Пиво # 1301.
 * @task 1. Подумай, какой из двух интерфейсов нужно реализовать в классе BeerLover.
 * 2. Добавь к классу BeerLover этот интерфейс и реализуй все его методы.
 * 3. Подумай, как связаны переменная READY_TO_GO_HOME и метод isReadyToGoHome.
 * 4. Верни значение переменной READY_TO_GO_HOME в методе isReadyToGoHome.
 *
 * Требования:
 * •	Класс BeerLover должен реализовывать(implements) интерфейс Alcoholic.
 * •	Класс BeerLover не должен реализовывать интерфейс Drinker напрямую(только опосредованно через Alcoholic)
 * •	В классе BeerLover должны быть реализованы все методы интерфейса Alcoholic.
 * •	В классе BeerLover должны быть реализованы все методы интерфейса Drinker.
 * •	Метод isReadyToGoHome должен возвращать значение переменной READY_TO_GO_HOME.
 */

public class Task_1301 {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);
        void sayThankYou();
        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;
        void sleepOnTheFloor();
    }

    public static class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {
            System.out.println(message);
        }

        @Override
        public void sayThankYou() {
            System.out.println("Thank you");
        }

        @Override
        public  boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println("sleeeep");
        }
    }
}