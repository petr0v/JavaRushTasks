package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static  String readString() throws Exception {
        BufferedReader string = new BufferedReader(new InputStreamReader(System.in));
        String a = string.readLine();
        return a;
    }

    public static int readInt() throws Exception {
        BufferedReader Int = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(Int.readLine());
        return b;
    }

    public static double readDouble() throws Exception {
        BufferedReader Db = new BufferedReader(new InputStreamReader(System.in));
        double c = Double.parseDouble(Db.readLine());
        return c;


    }

    public static boolean readBoolean() throws Exception {
        BufferedReader bn = new BufferedReader(new InputStreamReader(System.in));
        boolean d = Boolean.parseBoolean(bn.readLine());
        return d;


    }

    public static void main(String[] args) {

    }
}
