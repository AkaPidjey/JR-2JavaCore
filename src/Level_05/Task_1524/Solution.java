package Level_05.Task_1524;

/**
 * Title - Порядок загрузки переменных # 1524.
 * @task Разберись, что и в какой последовательности инициализируется. Поставь брейкпойнты и используй дебаггер.
 *
 * Исправить порядок инициализации данных так, чтобы результат был следующим:
 * static void init()
 * Static block
 * public static void main
 * Non-static block
 * static void printAllFields
 * 0
 * null
 * Solution constructor
 * static void printAllFields
 * 6
 * First name
 *
 * Требования:
 * •	Программа должна выводить данные на экран.
 * •	Вывод на экран должен соответствовать условию задачи.
 * •	Результатом работы статического инициализатора класса Solution должен быть вывод на экран строк
 * "static void init()" и "Static block".
 * •	Программа не должна считывать данные с клавиатуры.
 */

public class Solution {
    static {
        init();
    }
    static void init() {
        System.out.println("static void init()");
    }
    static {
        System.out.println("Static block");
    }
    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }
    {
        System.out.println("Non-static block");
        printAllFields(this);
    }
    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }
    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }
    public int i = 6;
    public String name = "First name";
}
