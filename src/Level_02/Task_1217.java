package Level_02;

/**
 * Title - Лететь, бежать и плыть # 1217.
 * @task Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавить в каждый интерфейс по одному методу.
 *
 * Требования:
 * •	Класс Solution должен содержать интерфейс CanFly.
 * •	Класс Solution должен содержать интерфейс CanRun.
 * •	Класс Solution должен содержать интерфейс CanSwim.
 * •	Интерфейс CanFly должен содержать один метод.
 * •	Интерфейс CanRun должен содержать один метод.
 * •	Интерфейс CanSwim должен содержать один метод.
 */

public class Task_1217 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        int method1();
    }

    public interface CanRun {
        String method2();
    }

    public interface CanSwim {
        boolean method3();
    }
}
