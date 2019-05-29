package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers[] = new int[20];
        int number[] = new int[10];
        int numba[] = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        for (int a = 0; a < number.length; a++) {
            number[a] = a;

            for (int b = 0; b < numba.length; b++) {
                numba[b] = b;

                System.arraycopy(numbers, 0, number, 0, 10);
                System.arraycopy(numbers, 10, numba,0 , 10);
                System.out.println(numba[b]);
            }
        }
    }
}
