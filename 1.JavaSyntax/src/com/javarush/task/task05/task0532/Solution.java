package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine());
        int maximum=Integer.parseInt(reader.readLine());
        if(N > 0){
            for (int i =0 ; i < (N-1); i++) {
                int jacobs = Integer.parseInt(reader.readLine());
                maximum = Math.max(maximum,jacobs);
            }
        }
            System.out.println(maximum);

    }
}