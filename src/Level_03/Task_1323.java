package Level_03;

/**
 * Title - Интерфейс Updatable в классе Screen # 1323.
 * @task Реализовать интерфейс Updatable в классе Screen.
 *
 * Требования:
 * •	Интерфейс Updatable должен наследовать(extends) интерфейс Selectable.
 * •	Класс Screen должен реализовывать(implements) интерфейс Updatable.
 * •	В классе Screen должен быть реализован метод onSelect интерфейса Selectable.
 * •	В классе Screen должен быть реализован метод refresh интерфейса Updatable.
 */

public class Task_1323 {
    public static void main(String[] args) throws Exception {}

    interface Selectable {
        void onSelect();
    }

    interface Updatable extends Selectable {
        void refresh();
    }

    class Screen implements Updatable {
        @Override
        public void onSelect() {}
        @Override
        public void refresh() {}
    }
}
