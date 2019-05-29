package com.javarush.task.task14.task1419;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
Нашествие исключений
Заполни список exceptions десятью(10) различными исключениями.
Первое исключение уже реализовано в методе initExceptions.


Требования:
1. Список exceptions должен содержать 10 элементов.
2. Все элементы списка exceptions должны быть исключениями(потомками класса Throwable).
3. Все элементы списка exceptions должны быть уникальны.
4. Метод initExceptions должен быть статическим.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }
        try {throw new ArrayIndexOutOfBoundsException();}
        catch (ArrayIndexOutOfBoundsException e){
            exceptions.add(e);
        }

        try {
            //Object x[] = new String[3];
            //x[0] = new Integer(0);
            int x = 0;
            if (x == 0)
                throw new ArrayStoreException();
        } catch (ArrayStoreException e) {
            exceptions.add(e);
        }

        try {
            Object x = new Integer(0);
            System.out.println((String) x);
            //int x = 0;
            //if (x == 0)
                throw new ClassCastException();
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new NullPointerException();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new IllegalMonitorStateException();
        } catch (IllegalMonitorStateException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new NumberFormatException();
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new FileNotFoundException();

        } catch (FileNotFoundException e) {
            exceptions.add(e);
        }


        try {
            int x = 0;
            if (x == 0)
                throw new NegativeArraySizeException();

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            int x = 0;
            if (x == 0)
                throw new SecurityException();
        } catch (SecurityException e) {
            exceptions.add(e);
        }

    }
}


