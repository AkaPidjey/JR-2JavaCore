package Level_01;

/**
 * Title - Альтернативная цепочка наследования # 1117.
 * @task Расставь правильно "цепочку наследования" в классах: Carnivore (плотоядное животное),
 * Cow (корова), Dog (собака), Pig (свинья), Animal (животное).
 *
 * Требования:
 * •	В классе Solution должен быть public класс Carnivore (плотоядное животное).
 * •	В классе Solution должен быть public класс Cow (корова).
 * •	В классе Solution должен быть public класс Dog (собака).
 * •	В классе Solution должен быть public класс Pig (свинья).
 * •	В классе Solution должен быть public класс Animal (животное).
 * •	Правильно унаследуй класс Carnivore.
 * •	Правильно унаследуй класс Cow.
 * •	Правильно унаследуй класс Dog.
 * •	Правильно унаследуй класс Pig.
 */

public class Task_1117 {

    public static void main(String[] args) {}

    public class Carnivore extends Animal {}

    public class Cow extends Animal {}

    public class Dog extends Carnivore {}

    public class Pig extends Animal {}

    public class Animal {}
}
