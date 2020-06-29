package Level_02;

/**
 * Title - Есть, летать и двигаться # 1218.
 * @task Есть public интерфейсы CanFly(летать), CanMove(передвигаться), CanEat(есть).
 * Добавь эти интерфейсы классам Dog(собака), Car(автомобиль), Duck(утка), Airplane(самолет).
 *
 * Требования:
 * •	Класс Solution должен содержать интерфейс CanFly с одним методом fly().
 * •	Класс Solution должен содержать интерфейс CanMove с одним методом move().
 * •	Класс Solution должен содержать интерфейс CanEat с одним методом eat().
 * •	Собака должна уметь передвигаться и есть.
 * •	Автомобиль должен уметь передвигаться.
 * •	Самолет должен уметь передвигаться и летать.
 * •	Утка должна уметь передвигаться, летать и есть.
 */

public class Task_1218 {
    public static void main(String[] args) {
    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public abstract class Dog implements CanMove, CanEat {}

    public abstract class Duck implements CanFly, CanMove, CanEat {}

    public abstract class Car implements CanMove {}

    public abstract class Airplane implements CanFly, CanMove {}
}
