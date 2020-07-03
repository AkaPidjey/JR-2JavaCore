package Level_04.Task_1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Title - НОД # 1420.
 * @task Наибольший общий делитель (НОД).
 * Ввести с клавиатуры 2 целых положительных числа.
 * Вывести в консоль наибольший общий делитель.
 *
 * Требования:
 * •	Программа должна считывать с клавиатуры 2 строки.
 * •	В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
 * •	Программа должна выводить данные на экран.
 * •	Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //    System.out.println("Введите 2 целых положительных цисла");
        String str1 = br.readLine();
        String str2 = br.readLine();
        int count1 = Integer.parseInt(str1);
        int count2 = Integer.parseInt(str2);
        if (!isNumber(str1) || !isNumber(str2)) {
            throw new Exception();
        } else if (count1 <= 0 || count2 <= 0) {
            throw new Exception();
        }
        br.close();
        System.out.println(nod(count1, count2));
    }

    public static boolean isNumber(String vvod) {
        try {
            int i = Integer.parseInt(vvod);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static int nod (int count1, int count2) {
        int nod = 1;
        int min = 0;
        if (count1 > count2) {
            min = count2;
        } else {
            min = count1;
        }

        for (int a = 1; a <= min; a++) {
            if (count1 % a == 0 && count2 % a == 0) {
                nod = a;
            }
        }
        return nod;
    }
}
