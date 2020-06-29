package Level_02;

/**
 * Title - Класс Human и интерфейсы CanRun, CanSwim # 1220.
 * @task Напиши public класс Human(человек) и public интерфейсы CanRun(бежать/ездить), CanSwim(плавать).
 * Добавь в каждый интерфейс по oдному методу.
 * Добавь эти интерфейсы классу Human, но не реализуй методы.
 * Объяви класс Human абстрактным.
 *
 * Требования:
 * •	Класс Solution должен содержать интерфейс CanRun с одним методом.
 * •	Класс Solution должен содержать интерфейс CanSwim с одним методом.
 * •	Класс Solution должен содержать класс Human.
 * •	Класс Human должен реализовывать интерфейсы CanRun и CanSwim.
 * •	Класс Human должен быть абстрактным.
 * •	Класс Human не должен иметь методов.
 */

public class Task_1220 {
    public static void main(String[] args) {
    }

    public abstract class Human implements CanRun, CanSwim {}

    public interface CanRun {
        public void method1();
    }

    public interface CanSwim {
        public void method2();
    }
}
