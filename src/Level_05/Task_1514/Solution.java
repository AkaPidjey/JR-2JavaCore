package Level_05.Task_1514;

import java.util.HashMap;
import java.util.Map;

/**
 * Title - Статики-1 # 1514.
 * @task В статическом блоке инициализировать labels 5 различными парами ключ-значение.
 *
 * Требования:
 * •	В классе Solution должен быть только один метод (main).
 * •	В классе Solution должно быть объявлено статическое поле labels типа Map.
 * •	Поле labels должно быть заполнено 5 различными парами ключ-значение в статическом блоке.
 * •	Метод main должен выводить содержимое labels на экран
 */

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(1.0, "stroka1");
        labels.put(2.0, "stroka2");
        labels.put(3.0, "stroka3");
        labels.put(4.0, "stroka4");
        labels.put(5.0, "stroka5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
