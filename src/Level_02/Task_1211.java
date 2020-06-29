package Level_02;

/**
 * Title - Абстрактный класс Pet # 1211.
 * @task Сделать класс Pet абстрактным.
 *
 * Требования:
 * •	Программа не должна выводить текст на экран.
 * •	Класс Pet должен быть статическим.
 * •	Класс Pet должен быть абстрактным.
 * •	Класс Pet должен иметь один метод getName().
 */

public class Task_1211 {
    public static void main(String[] args) {
    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }
    }
}
