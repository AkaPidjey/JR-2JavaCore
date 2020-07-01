package Level_03;

/**
 * Title - Пиво-2. Возвращение # 1302.
 * @task Добавь к классу AlcoholicBeer интерфейс Drink и реализуй все его методы.
 *
 * Требования:
 * •	Класс AlcoholicBeer должен реализовывать(implements) интерфейс Drink.
 * •	В классе AlcoholicBeer должны быть реализованы все методы интерфейса Drink.
 * •	В классе AlcoholicBeer должно содержаться только два метода.
 * •	Метод isAlcoholic должен возвращать true, т.к. пиво содержит алкоголь.
 * •	Программа должна выводить на экран тип напитка в зависимости от того что возвращает метод isAlcoholic.
 */

public class Task_1302 {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {
        @Override
        public boolean isAlcoholic() {
            return true;
        }
        @Override
        public String toString() {
            if (isAlcoholic() == true) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }
        }
    }
}
