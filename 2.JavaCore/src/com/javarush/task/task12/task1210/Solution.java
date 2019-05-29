package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }
    public static int max(int a, int x) {
        if (a < x)
            return x;
        else
            return a;
    }

    public static long max(long b, long l) {
        if (b > l)
            return b;
        else
            return l;
    }

    public static double max(double d, double p) {
        if (d > p)
            return d;
        else
            return p;
    }

    //Напишите тут ваши методы
}
