package com.javarush.task.task19.task1907;

/* 
Считаем слово
Считаем слово
Считать с консоли имя файла.
Файл содержит слова, разделенные знаками препинания.
Вывести в консоль количество слов "world", которые встречаются в файле.
Закрыть потоки.


Требования:
1. Программа должна считывать имя файла с консоли (используй BufferedReader).
2. BufferedReader для считывания данных с консоли должен быть закрыт.
3. Программа должна считывать содержимое файла (используй FileReader c конструктором принимающим String).
4. Поток чтения из файла (FileReader) должен быть закрыт.
5. Программа должна выводить в консоль количество слов "world", которые встречаются в файле.
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String s = bf.readLine();
        bf.close();


        BufferedReader fileReader = new BufferedReader(new FileReader(s));
        int count = 0;

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] words = line.toString().split("\\W");
            for(String x : words)
            if (x.equals("world")) {
                count++;
            }
        }
            fileReader.close();
        System.out.println(count);
    }
}