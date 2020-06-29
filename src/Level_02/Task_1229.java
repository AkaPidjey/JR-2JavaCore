package Level_02;

/**
 * Title - Родитель класса CTO # 1229.
 * @task Добавь такой класс-родитель к классу CTO(технический директор), чтобы класс перестал быть абстрактным.
 * Добавлять/реализовывать методы в классе CTO запрещается.
 *
 * Требования:
 * •	Класс Solution должен содержать интерфейс Businessman с методом void workHard().
 * •	Класс Solution должен содержать не абстрактный класс CTO.
 * •	Класс CTO должен реализовывать интерфейс Businessman.
 * •	Класс CTO не должен содержать методов.
 * •	Класс Solution должен содержать дополнительный класс.
 * •	Класс CTO должен наследоваться от дополнительного класса.
 * •	Дополнительный класс должен содержать один метод.
 */

public class Task_1229 {
    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class STOAll {
        public void workHard() {
            System.out.println("cto");
        }
    }

    public static class CTO extends STOAll implements Businessman {
    }
}
