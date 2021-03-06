package Level_03;

import java.io.*;

/**
 * Title - Писатель в файл с консоли # 1319.
 * @task 1. Прочесть с консоли имя файла.
 * 2. Считывать строки с консоли, пока пользователь не введет строку "exit".
 * 3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.
 *
 * Требования:
 * •	Программа должна считывать c консоли имя файла.
 * •	Создай и используй объект типа BufferedWriter.
 * •	Программа не должна ничего читать из файловой системы.
 * •	Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
 * •	Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
 * •	Метод main должен закрывать объект типа BufferedWriter после использования.
 * •	Метод main не должен выводить данные на экран.
 */

public class Task_1319 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String outputFileName = reader.readLine();
        BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"));
        String data;
        while (!(data = reader.readLine()).equals("exit")) {
            writer.write(data + "\n");
        }
        writer.write(data + "\n");
        reader.close();
        writer.close();
    }
}
