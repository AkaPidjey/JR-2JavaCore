package Level_01;

/**
 * Title - Все мировые религии # 1114.
 * @task Изменить три класса: Judaism (Иудаизм), Christianity (Христианство), Islam (Мусульманство).
 * Унаследовать христианство от иудаизма и мусульманство от христианства.
 *
 * Требования:
 * •	В классе Solution должен быть public класс Judaism (Иудаизм).
 * •	В классе Solution должен быть public класс Christianity (Христианство).
 * •	В классе Solution должен быть public класс Islam (Мусульманство).
 * •	Класс Christianity должен быть унаследован от класса Judaism.
 * •	Класс Islam должен быть унаследован от класса Christianity.
 */

public class Task_1114 {
    public static void main(String[] args) {}

    public class Judaism {}

    public class Christianity extends Judaism {}

    public class Islam extends Christianity {}
}
