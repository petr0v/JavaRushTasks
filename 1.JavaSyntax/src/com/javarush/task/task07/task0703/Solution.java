package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[10];
        for (int i = 0; i < list.length; i++) {
            list[i] = reader.readLine();
        }
        int[] numbers = new int[10];
        for (int a = 0; a < numbers.length; a++) {
            numbers[a] = a;
        }
            int a =list.length;
            System.out.println(a);
        }
    }