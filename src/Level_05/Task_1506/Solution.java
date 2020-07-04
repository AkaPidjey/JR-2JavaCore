package Level_05.Task_1506;

/**
 * Title - Что-то лишнее # 1506.
 * @task 1. Программа должна выводить следующее:
 * Это double
 * Это Object
 * Это double
 * Это Integer
 * Это double
 *
 * 2. Удали реализации всех лишних методов
 *
 * Требования:
 * •	В классе Solution должен остаться метод print с одним параметром типа Integer.
 * •	В классе Solution должен остаться метод print с одним параметром типа Object.
 * •	В классе Solution должен остаться метод print с одним параметром типа double.
 * •	Вывод на экран должен соответствовать условию.
 */

public class Solution {
    public static void main(String[] args) {
        print((short) 1);
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {
        System.out.println("Это Integer");
    }

    public static void print(Object i) {
        System.out.println("Это Object");
    }

    public static void print(double i) {
        System.out.println("Это double");
    }
}
