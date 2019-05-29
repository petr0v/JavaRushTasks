package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
Писатель в файл с консоли
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести абсолютно все введенные строки в файл, каждую строчку с новой строки.


Требования:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего читать из файловой системы.
4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать абсолютно все введенные строки (включая "exit") в файл, каждую строчку с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer1 = new BufferedWriter(new FileWriter(reader.readLine()));
        while (true) {
            String current = reader.readLine();
            if (!current.equals("exit")) {
                writer1.write(current);
                writer1.newLine();

            } else {
                writer1.write(current);
                break;
            }
        }
        writer1.close();
        reader.close();
    }
}

