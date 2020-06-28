package Level_01;

/**
 * Title - От школьника до квалифицированного раба # 1115.
 * @task Изменить четыре класса: Schoolboy (школьник), Student (студент), Worker (Сотрудник), Slave (Раб).
 * Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
 *
 * Требования:
 * •	В классе Solution должен быть public класс Schoolboy (школьник).
 * •	В классе Solution должен быть public класс Student (студент).
 * •	В классе Solution должен быть public класс Worker (Сотрудник).
 * •	В классе Solution должен быть public класс Slave (Раб).
 * •	Класс Student должен быть унаследован от класса Schoolboy.
 * •	Класс Worker должен быть унаследован от класса Student.
 * •	Класс Slave должен быть унаследован от класса Worker.
 */

public class Task_1115 {
    public static void main(String[] args) {}

    public class Schoolboy {}

    public class Student extends Schoolboy {}

    public class Worker extends Student {}

    public class Slave extends Worker {}
}
