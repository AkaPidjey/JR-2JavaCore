package Level_02;

/**
 * Title - Int и Integer # 1207.
 * @task Написать два метода: print(int) и print(Integer).
 * Написать такой код в методе main, чтобы вызвались они оба.
 *
 * Требования:
 * •	Класс Solution должен содержать статический метод main().
 * •	Класс Solution должен содержать статический void метод print() с параметром типа int.
 * •	Класс Solution должен содержать статический void метод print() с параметром типа Integer.
 * •	Метод main() должен вызывать метод print() с параметром типа int.
 * •	Метод main() должен вызывать метод print() с параметром типа Integer.
 */

public class Task_1207 {
    public static void main(String[] args) {
        print(10);
        print((Integer) 20);
    }

    public static void print(int i) {}

    public static void print(Integer i) {}
}
