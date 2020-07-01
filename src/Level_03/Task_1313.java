package Level_03;

import java.awt.*;

/**
 * Title - Лисица — это такое животное # 1313.
 * @task 1. Реализуй в классе Fox интерфейс Animal.
 * 2. Поменяй код так, чтобы в классе Fox был только один метод - getName.
 * 3. Создавать дополнительные классы и удалять методы нельзя!
 *
 * Требования:
 * •	Интерфейс Animal должен быть реализован в классе Fox.
 * •	В классе Fox должен быть реализован только один метод(getName).
 * •	В интерфейсе Animal должен быть объявлен метод getColor.
 * •	Дополнительные классы или интерфейсы создавать нельзя.
 */

public class Task_1313 {
    public static void main(String[] args) throws Exception {
    }

    public interface Animal {
        Color getColor();
    }

    public static abstract class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }
}
