package Level_05.Task_1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Title - Парсер реквестов # 1527.
 * @task Считать с консоли URL-ссылку.
 * Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
 * URL содержит минимум 1 параметр.
 * Выводить параметры нужно в той же последовательности, в которой они представлены в URL.
 * Если присутствует параметр obj, то передать его значение в нужный метод alert.
 * alert(double value) - для чисел (дробные числа разделяются точкой)
 * alert(String value) - для строк
 * Обрати внимание на то, что метод alert необходимо вызывать ПОСЛЕ вывода списка всех параметров на экран.
 *
 * Пример 1
 *
 * Ввод:
 * http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
 *
 * Вывод:
 * lvl view name
 *
 * Пример 2
 *
 * Ввод:
 * http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
 *
 * Вывод:
 * obj name
 * double: 3.14
 *
 * Требования:
 * •	Программа должна считывать с клавиатуры только одну строку.
 * •	Класс Solution не должен содержать статические поля.
 * •	Программа должна выводить данные на экран в соответствии с условием.
 * •	Программа должна вызывать метод alert с параметром double в случае, если значение параметра obj
 * может быть корректно преобразовано в число типа double.
 * •	Программа должна вызывать метод alert с параметром String в случае, если значение параметра obj
 * НЕ может быть корректно преобразовано в число типа double.
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        List<String> listStr = new ArrayList<>();
        List<String> listStr2 = new ArrayList<>();
        List<String> listStr3 = new ArrayList<>();
        int start = str.indexOf("?");
        String str2 = str.substring(start + 1);

        while (str2.contains("&")) {
            int temp = str2.indexOf("&");
            listStr.add(str2.substring(0, temp));
            str2 = str2.substring(temp + 1);
        }
        listStr.add(str2);

        for (int a = 0; a < listStr.size(); a++) {
            if (listStr.get(a).contains("=")) {
                int temp = listStr.get(a).indexOf("=");
                listStr2.add(listStr.get(a).substring(0, temp));
            } else listStr2.add(listStr.get(a));
        }

        for (int b = 0; b < listStr.size(); b++) {
            if (listStr.get(b).contains("obj")) {
                int temp = listStr.get(b).indexOf("=");
                listStr3.add(listStr.get(b).substring(temp + 1));
            }
        }

        for ( String i : listStr2) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println("");

        for (int c = 0; c < listStr3.size(); c++) {
            try {
                alert(Double.parseDouble(listStr3.get(c)));
            } catch (Exception e) {
                alert(listStr3.get(c));
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
