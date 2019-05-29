package com.javarush.task.task06.task0611;

/* 
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String s) {
        String result = s+s+s+s+s;
        return result;
    }

    public static String multiply(String s, int count) {
        String result = s;
        for (int x =1;x<count;x++){
            result =result +s;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(multiply("Amigo"));
        System.out.println(multiply("Amigo",3));

    }
}
