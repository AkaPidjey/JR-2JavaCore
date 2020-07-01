package Level_03;

import java.io.*;

/**
 * Title - Чтение файла # 1318.
 * @task 1. Считать с консоли имя файла.
 * 2. Вывести в консоль(на экран) содержимое файла.
 * 3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
 *
 * Требования:
 * •	Программа должна считывать c консоли имя файла.
 * •	Программа должна выводить на экран содержимое файла.
 * •	Поток чтения из файла (FileInputStream) должен быть закрыт.
 * •	BufferedReader также должен быть закрыт.
 */

public class Task_1318 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        InputStream inputStream = new FileInputStream(name);
        reader.close();
        while (inputStream.available() > 0) {
            char temp = (char) inputStream.read();
            System.out.print(temp);
        }
        inputStream.close();
    }
}
