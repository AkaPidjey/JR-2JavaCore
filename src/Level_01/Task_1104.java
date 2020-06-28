package Level_01;

/**
 * Title - Хороши работнички # 1104.
 * @task Написать четыре класса: Employee (сотрудник), Manager (управляющий), Chief (директор) и Secretary (секретарь).
 * Унаследовать управляющего, директора и секретаря от сотрудника.
 *
 * Требования:
 * •	В классе Solution должен быть public класс Employee (сотрудник).
 * •	В классе Solution должен быть public класс Manager (управляющий).
 * •	В классе Solution должен быть public класс Chief (директор).
 * •	В классе Solution должен быть public класс Secretary (секретарь).
 * •	Класс Manager должен быть унаследован от класса Employee.
 * •	Класс Chief должен быть унаследован от класса Employee.
 * •	Класс Secretary должен быть унаследован от класса Employee.
 */

public class Task_1104 {
    public static void main(String[] args) {}

    public class Manager extends Employee {}

    public class Chief extends Employee {}

    public class Employee {}

    public class Secretary extends Employee {}
}
