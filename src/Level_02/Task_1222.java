package Level_02;

/**
 * Title - Больше не Пушистик # 1222.
 * @task Переопредели метод setName в классе Cat так, чтобы программа выдавала на экран надпись
 *
 * "Я - кот"
 *
 * Требования:
 * •	Класс Solution должен содержать класс Pet.
 * •	Класс Solution должен содержать класс Cat.
 * •	Класс Cat должен наследоваться от класса Pet.
 * •	Класс Pet должен содержать два метода getName() и setName().
 * •	Класс Cat должен переопределять метод setName().
 * •	Программа должна выводить на экран результат метода getName() объекта pet.
 */

public class Task_1222 {
    public static void main(String[] args) {
        Pet pet = new Cat();
        pet.setName("Я - кот");
        System.out.println(pet.getName());
    }

    public static class Pet {
        protected String name;
        public Pet() {
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return super.getName();
        }
        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }
}