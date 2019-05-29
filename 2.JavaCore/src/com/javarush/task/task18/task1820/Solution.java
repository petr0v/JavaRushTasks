package com.javarush.task.task18.task1820;

/* 
Округление чисел
Округление чисел
Считать с консоли 2 имени файла.
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415.
Округлить числа до целых и записать через пробел во второй файл.
Закрыть потоки.

Принцип округления:
3.49 => 3
3.50 => 4
3.51 => 4
-3.49 => -3
-3.50 => -3
-3.51 => -4


Требования:
1. Программа должна два раза считать имена файлов с консоли.
2. Для первого файла создай поток для чтения. Для второго - поток для записи.
3. Считать числа из первого файла, округлить их и записать через пробел во второй.
4. Должны соблюдаться принципы округления, указанные в задании.
5. Созданные для файлов потоки должны быть закрыты.
*/

import java.io.*;
import java.util.ArrayList;


public class Solution {
    public static void main(String[] args) throws IOException,FileNotFoundException {
        ArrayList<Integer>list=new ArrayList<>();
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        String source=reader.readLine();
        String solut=reader.readLine();
        reader.close();
        BufferedReader readerr=new BufferedReader(new InputStreamReader(new FileInputStream(source)));

        FileOutputStream fileOut=new FileOutputStream(solut);
        double last;
        String str;
        StringBuffer string=new StringBuffer();

        str=readerr.readLine();
        readerr.close();
        for (String ret:str.split(" ")){
            last= Double.parseDouble(ret);
            list.add((int) Math.round(last));
        }
        for(int j=0;j<list.size();j++){
            String sb=list.get(j).toString();
            string.append(sb+" ");

        }
        fileOut.write((string.substring(0)).getBytes());
        fileOut.close();

    }
}
