package Level_04.Task_1419;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Title - Нашествие исключений # 1419.
 * @task Заполни список exceptions десятью(10) различными исключениями.
 * Первое исключение уже реализовано в методе initExceptions.
 *
 * Требования:
 * •	Список exceptions должен содержать 10 элементов.
 * •	Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
 * •	Все элементы списка exceptions должны быть уникальны.
 * •	Метод initExceptions должен быть статическим.
 */

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        arrayIndexException();
        arrayStoreException();
        indexOutException();
        negativeArrayException();
        npeException();
        numberFormatException();
        stringIndexException();
        classCastException();
        fileNotFoundException();
        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   // ==> 1
        try {
            float i = 1 / 0;
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void indexOutException() {   // ==> 2
        try {
            ArrayList<String> strings = new ArrayList<>();
            strings.get(4);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void arrayStoreException() {   // ==> 3
        try {
            Number[] a = new Double[2];
            a[0] = new Integer(4);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void arrayIndexException() {   // ==> 4
        try {
            int[] list = new int[2];
            list[1] = 1;
            list[2] = 2;
            for (int a = 0; a <= list.length; a++) {
                list[a] = a;
            }
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void negativeArrayException() {   // ==> 5
        try {
            int a = 4;
            int b = 5;
            int[] list = new int[a - b];
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    private static void npeException() {   // ==> 6
        try {
            String str1 = "ras";
            String str2 = null;
            str1 = str2.toString();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    public static void numberFormatException() {   // ==> 7
        try {
            String str = "ras";
            int i = Integer.parseInt(str);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    public static void stringIndexException() {   // ==> 8
        try {
            System.out.println("a".substring(2).equals(""));
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    public static void classCastException() {   // ==> 9
        try {
            Object ch = new Character('*');
            System.out.println((Byte) ch);
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

    public static void fileNotFoundException() {   // ==> 10
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(new File("DGds")));
        } catch (Exception e) {
            exceptions.add(e);
        }
    }
}
