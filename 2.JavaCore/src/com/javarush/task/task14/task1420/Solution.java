package com.javarush.task.task14.task1420;

/* 
НОД
НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.


Требования:
1. Программа должна считывать с клавиатуры 2 строки.
2. В случае если введенные строки невозможно преобразовать в положительные целые числа, должно возникать исключение.
3. Программа должна выводить данные на экран.
4. Программа должна выводить на экран наибольший общий делитель(НОД) чисел считанных с клавиатуры и успешно завершаться.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String x = reader.readLine();
        int i = Integer.parseInt(s);
        int j = Integer.parseInt(x);
        if (i <= 0 || j <= 0) throw new Exception();

        int d;
        while (j != 0) {
            d = i % j;
            i = j;
            j = d;
        }
        System.out.println(i);
    }
}

