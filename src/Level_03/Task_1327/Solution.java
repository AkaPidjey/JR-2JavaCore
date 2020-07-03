package Level_03.Task_1327;

/**
 * Title - Репка # 1327.
 * @task Сказка Репка:
 * 1. Реализовать интерфейс RepkaItem в классе Person.
 * 2. В классе Person реализовать метод pull(Person person), который выводит фразу типа '<name> за <person>'.
 *
 * Пример:
 * Бабка за Дедку
 * Дедка за Репку
 *
 * 3. Исправить логическую ошибку цикла в методе tell класса RepkaStory.
 * 4. Выполнить метод main и наслаждаться сказкой!
 *
 * Требования:
 * •	Интерфейс RepkaItem должен быть реализован в классе Person.
 * •	В классе Person должен быть реализован метод pull c одним параметром типа Person.
 * •	Метод pull в классе Person должен выводить на экран фразу типа '<name> за <person>'. Например: Бабка за Дедку.
 * •	В результате выполнения метода main на экран должен быть выведен краткий вариант сказки про Репку.
 */

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}