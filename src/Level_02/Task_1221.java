package Level_02;

/**
 * Title - Все мы немного кошки… # 1221.
 * @task Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись "Я - кот".
 *
 * Требования:
 * •	Класс Solution должен содержать класс Pet.
 * •	Класс Solution должен содержать класс Cat.
 * •	Класс Cat должен наследоваться от класса Pet.
 * •	Класс Pet должен содержать один метод getName().
 * •	Класс Cat должен переопределять метод getName().
 * •	Программа должна выводить на экран результат метода getName() объекта pet.
 */

public class Task_1221 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        System.out.println(pet.getName());
    }

    public static class Pet {
        public String getName() {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet {
        public String getName() { return "Я - кот"; }
    }
}
