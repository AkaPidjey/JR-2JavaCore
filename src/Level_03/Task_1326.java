package Level_03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Title - Сортировка четных чисел из файла # 1326.
 * @task 1. Ввести имя файла с консоли.
 * 2. Прочитать из него набор чисел.
 * 3. Вывести на консоль только четные, отсортированные по возрастанию.
 *
 * Пример ввода:
 * 5
 * 8
 * -2
 * 11
 * 3
 * -5
 * 2
 * 10
 *
 * Пример вывода:
 * -2
 * 2
 * 8
 * 10
 *
 * Требования:
 * •	Программа должна считывать данные с консоли.
 * •	Программа должна создавать FileInputStream для введенной с консоли строки.
 * •	Программа должна выводить данные на экран.
 * •	Программа должна вывести на экран все четные числа считанные из файла отсортированные по возрастанию.
 * •	Программа должна закрывать поток чтения из файла(FileInputStream).
 */

public class Task_1326 {
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>();
        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();
        FileInputStream fis = new FileInputStream(fileName);
        BufferedReader br2 = new BufferedReader(new InputStreamReader(fis));

        while ((str = br2.readLine()) != null) {
            Integer num = Integer.parseInt(str);
            if (num % 2 == 0) {
                list.add(num);
            }
        }
        fis.close();
        br2.close();

        Collections.sort(list);
        for (int a : list) {
            System.out.println(a);
        }
    }
}
