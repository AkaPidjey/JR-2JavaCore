package Level_01;

/**
 * Title - ИТ-компания # 1105.
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

public class Task_1105 {
    public static void main(String[] args) {}

    public class Worker {}

    public class Clerk extends Worker {}

    public class IT extends Worker {}

    public class Programmer extends IT {}

    public class ProjectManager extends IT {}

    public class CTO extends IT {}

    public class OfficeManager extends Clerk{}

    public class HR extends Clerk {}

    public class Cleaner extends Clerk {}
}
