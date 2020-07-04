package Level_05.Task_1508;

/**
 * Title - ООП - Перегрузка - убираем лишнее # 1508.
 * @task 1. Подумайте, какая из реализаций метода print будет вызвана.
 * 2. Удалите все лишние реализации метода print.
 *
 * Требования:
 * •	В классе Solution кроме метода main должен остаться только один метод print(с правильным параметром!).
 * •	Метод print должен быть публичным.
 * •	Метод print должен быть статическим.
 * •	Программа должна выводить на экран строку "Я буду Java прогером!".
 */

public class Solution {
    public static void main(String[] args) {
        print(1);
    }

    public static void print(long l) {
        System.out.println("Я буду Java прогером!");
    }
}
