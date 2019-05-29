package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/
public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String sShortest = null;
        String sLongest = null;

        int indexOfShortest = 0;
        int indexOfLongest = 0;

        for (int i = 0; i < 10; i++) {
            list.add(reader.readLine());
        }

        int shortest = list.get(0).length();
        int longest = list.get(0).length();

        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            if ( i ==0 || s.length() < shortest) {
                shortest = s.length();
                sShortest = s;
                indexOfShortest = i;
            }
            if (i == 0 || s.length() > longest) {
                longest = s.length();
                sLongest = s;
                indexOfLongest = i;
            }
        }

        System.out.println(indexOfShortest < indexOfLongest ? sShortest : sLongest);
    }
}
