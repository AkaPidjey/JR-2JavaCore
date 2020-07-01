package Level_03;

/**
 * Title - Selectable и Updatable # 1304.
 * @task Создай класс Screen и реализуй в нем интерфейсы Selectable и Updatable.
 * Не забудь реализовать методы!
 *
 * Требования:
 * •	Класс Screen должен реализовывать(implements) интерфейс Selectable.
 * •	Класс Screen должен реализовывать(implements) интерфейс Updatable.
 * •	В классе Screen должен быть реализованы методы интерфейса Selectable.
 * •	В классе Screen должен быть реализованы методы интерфейса Updatable.
 */

public class Task_1304 {
    public static void main(String[] args) throws Exception {
    }

    interface Selectable {
        void onSelect();
    }

    interface Updatable {
        void refresh();
    }

    public class Screen implements Selectable, Updatable {
        @Override
        public void onSelect() {
        }
        @Override
        public void refresh() {
        }
    }
}
