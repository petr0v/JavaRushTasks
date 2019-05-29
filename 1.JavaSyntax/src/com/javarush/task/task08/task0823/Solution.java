package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine().trim();
        for (String x : s.split("\\s+")) {
            String capitalize = Character.toUpperCase(x.charAt(0)) + x.substring(1).toLowerCase();
            System.out.print(capitalize + " ");
        }
    }
    //напишите тут ваш код
}

