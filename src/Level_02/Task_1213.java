package Level_02;

/**
 * Title - «Исправь код», часть 2 # 1213.
 * @task Исправь код, чтобы программа компилировалась.
 *
 * Требования:
 * •	Класс Pet должен быть статическим.
 * •	Класс Pet должен иметь два метода.
 * •	Метод getChild() должен быть абстрактным.
 * •	Класс Pet должен быть объявлен с модификатором, который запрещает создавать конкретные объекты этого класса.
 */

public class Task_1213 {
    public static void main(String[] args) {
    }

    public static abstract class Pet {
        public String getName() {
            return "Я - котенок";
        }
        public abstract Pet getChild();
    }
}
