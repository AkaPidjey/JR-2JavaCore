package Level_05.Task_1523;

/**
 * Title - Перегрузка конструкторов # 1523.
 * @task 1. В классе Solution создай 4 конструктора с разными модификаторами доступа.
 * 2. В отдельном файле создай класс SubSolution и сделай его потомком класса Solution.
 * 3. Внутри класса SubSolution создай конструкторы командой Alt+Insert -> Constructors.
 * 4. Исправь модификаторы доступа конструкторов в SubSolution так, чтобы получилось 3 конструктора с
 * различными модификаторами доступа(все кроме private).
 *
 * Требования:
 * •	В классе SubSolution должно содержаться 3 различных конструктора.
 * •	В классе Solution должно содержаться 4 различных конструктора.
 * •	В классе Solution должны быть объявлены конструкторы со всеми возможными модификаторами доступа.
 * •	В классе SubSolution должны быть объявлены конструкторы со всеми возможными модификаторами доступа кроме private.
 * •	Класс Solution должен быть родителем класса SubSolution.
 */

public class Solution {
    private int a;
    private int b;
    private int c;

    private Solution() {}

    Solution(int a) {
        this.a = a;
    }

    protected Solution(int a, int b) {
        this.a = a; this.b = b;
    }

    public Solution(int a, int b, int c) {
        this.a = a; this.b = b; this.c = c;
    }

    public static void main(String[] args) {}
}
