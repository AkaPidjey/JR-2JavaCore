package Level_04.Task_1408;

/**
 * Title - Куриная фабрика # 1408.
 * @task Написать Фабрику(Factory) по производству кур(Hen):
 *
 * 1. Создать класс Hen.
 * 1.1. Сделать его абстрактным.
 * 1.2. Добавить в класс абстрактный метод int getCountOfEggsPerMonth().
 * 1.3. Добавить в класс метод String getDescription(), который возвращает строку "Я - курица.".
 * 2. Создать класс RussianHen, который наследуется от Hen.
 * 3. Создать класс UkrainianHen, который наследуется от Hen.
 * 4. Создать класс MoldovanHen, который наследуется от Hen.
 * 5. Создать класс BelarusianHen, который наследуется от Hen.
 * 6. В каждом из четырех последних классов написать свою реализацию метода getCountOfEggsPerMonth.
 * Методы должны возвращать количество яиц в месяц от данного типа куриц.
 * 7. В каждом из четырех последних классов написать свою реализацию метода getDescription.
 *
 * Методы должны возвращать строку вида:
 * <getDescription() родительского класса> + <" Моя страна - Sssss. Я несу N яиц в месяц.">
 * где Sssss - название страны
 * где N - количество яиц в месяц
 *
 * 8. В классе HenFactory реализовать метод getHen, который возвращает соответствующую стране породу кур.
 * 9. Все созданные вами классы должны быть в отдельных файлах.
 *
 * Требования:
 * •	Класс Hen должен быть абстрактным.
 * •	Класс Hen должен содержать абстрактный метод int getCountOfEggsPerMonth().
 * •	В классе Hen должен быть реализован метод String getDescription(), который возвращает строку "Я - курица.".
 * •	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны наследоваться от класса Hen и
 * быть созданы в отдельных файлах.
 * •	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны реализовывать метод getCountOfEggsPerMonth,
 * который должен возвращать количество яиц в месяц от данного типа куриц.
 * •	Классы RussianHen, UkrainianHen, MoldovanHen и BelarusianHen должны переопределять метод getDescription
 * родительского класса, таким образом, чтобы возвращаемая ими строка имела вид: <getDescription()
 * родительского класса> + < Моя страна - Sssss. Я несу N яиц в месяц.> где Sssss - название страны,
 * а N - количество яиц в месяц.
 * •	Метод getHen должен быть реализован в классе HenFactory и должен возвращать тип кур для переданной в него страны.
 */


public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
        System.out.println(hen.getDescription());
    }

    static class HenFactory implements Country {

        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(RUSSIA)) {
                hen = new RussianHen();
            } else if ( country.equals(UKRAINE)) {
                hen = new UkrainianHen();
            } else if (country.equals(MOLDOVA)) {
                hen = new MoldovanHen();
            } else if (country.equals(BELARUS)) {
                hen = new BelarusianHen();
            }
            return hen;
        }
    }
}