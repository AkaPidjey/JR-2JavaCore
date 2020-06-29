package Level_02;

/**
 * Title - Создаем человека # 1219.
 * @task Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
 *
 * Требования:
 * •	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
 * •	Класс Solution должен содержать интерфейс CanRun с одним методом run().
 * •	Класс Solution должен содержать интерфейс CanSwim с одним методом swim().
 * •	Человек должен уметь бегать и плавать.
 * •	Утка должна уметь летать, плавать и бегать.
 * •	Пингвин должен уметь плавать и бегать.
 * •	Самолет должен уметь летать и ездить.
 */

public class Task_1219 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public abstract class Human implements CanRun, CanSwim {}

    public abstract class Duck implements CanFly, CanSwim, CanRun {}

    public abstract class Penguin implements CanSwim, CanRun {}

    public abstract class Airplane implements CanFly, CanRun {}
}
