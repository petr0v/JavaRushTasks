package com.javarush.task.task18.task1809;

/* 
Реверс файла
верс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке.
Закрыть потоки.


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для чтения из файла используй поток FileInputStream, для записи в файл - FileOutputStream
3. Во второй файл нужно записать все байты из первого в обратном порядке.
4. Потоки FileInputStream и FileOutputStream должны быть закрыты.
*/

import java.io.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String s1 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(s);
        FileOutputStream fileOutputStream = new FileOutputStream(s1);
        byte[] array = new byte[fileInputStream.available()];
        while(fileInputStream.available()>0){
            int data = fileInputStream.read(array);
            for (int i = 0; i < array.length / 2; i++) {
                int temp = array[i];
                array[i] = array[array.length - 1 - i];
                array[array.length - 1 - i] = (byte) temp;
            }

            fileOutputStream.write(array,0,data);
        }
        reader.close();
        fileInputStream.close();
        fileOutputStream.close();

    }
}
