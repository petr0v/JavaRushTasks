package com.javarush.task.task19.task1910;

/* 
Пунктуация
Пунктуация
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Считать содержимое первого файла, удалить все знаки пунктуации, включая символы новой строки.

Результат вывести во второй файл.

Закрыть потоки.


Требования:
1. Программа должна считывать имена файлов с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое первого файла (используй BufferedReader c конструктором FileReader).
4. Поток чтения из файла (BufferedReader) должен быть закрыт.
5. Программа должна записывать во второй файл содержимое первого файла, где удалены все знаки пунктуации, включая символы новой строки (Для записи в файл используй BufferedWriter с конструктором FileWriter).
6. Поток записи в файл (BufferedWriter) должен быть закрыт.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        String x = bf.readLine();
        bf.close();
        BufferedReader fr = new BufferedReader(new FileReader(s));
        BufferedWriter fw = new BufferedWriter(new FileWriter(x));

        while (fr.ready()) {
            String str = fr.readLine();
            String strings = str.replaceAll("[\\p{Punct}\\n]","");
                fw.write(strings);
        }
        fr.close();
        fw.close();
    }
}
