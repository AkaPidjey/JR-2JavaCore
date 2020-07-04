package Level_05.Task_1515;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - Статики-2 # 1515.
 * @task 1. В статическом блоке считайте две переменные с консоли А и В с типом int.
 * 2. Не забыть про IOException, который надо обработать в блоке catch.
 * 3. Закрыть поток ввода методом close().
 *
 * Требования:
 * •	Поле A должно быть публичным и статическим.
 * •	Поле B должно быть публичным и статическим.
 * •	Программа должна считывать данные с клавиатуры в статическом блоке.
 * •	Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
 * •	Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.
 */

public class Solution {
    public static int A;
    public static int B;

    static {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            A = Integer.parseInt(br.readLine());
            B = Integer.parseInt(br.readLine());
            br.close();
        } catch (Exception e) {
            new Exception(e);
        }
    }

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
