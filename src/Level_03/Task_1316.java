package Level_03;

/**
 * Title - Некорректные строки # 1316.
 * @task Удали все некорректные строки в интерфейсе Button.
 *
 * Требования:
 * •	Интерфейс SimpleObject должен быть объявлен внутри класса Solution.
 * •	Интерфейс Button должен быть объявлен внутри класса Solution.
 * •	Метод main менять нельзя.
 * •	В интерфейсе Button должно остаться объявление константы NAME.
 * •	В интерфейсе Button должно остаться корректное объявление метода onPress.
 */

public class Task_1316 {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
        void onPress();
    }

    interface Button extends SimpleObject {
        final String NAME = "Submit";

        //    public void onPress();

        //    protected void onPress();

        //    void onPress();

        //    private void onPress();

        //    protected String onPress(Object o);

        String onPress(Object o);

        //    private String onPress(Object o);
    }
}
