package Level_02;

/**
 * Title - Корова — тоже животное # 1214.
 * @task Унаследуй класс Cow от Animal.
 * Реализуй все недостающие методы в классе Cow.
 *
 * Требования:
 * •	Класс Animal должен быть абстрактным.
 * •	Класс Cow не должен быть абстрактным.
 * •	Класс Cow должен наследоваться от класса Animal.
 * •	Класс Cow должен реализовать абстрактный метод из класса Animal.
 * •	Метод getName() класса Cow должен возвращать любое имя коровы.
 */

public class Task_1214 {
    public static void main(String[] args) {
    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        public String getName() {
            return "";
        }
    }
}
