package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int i = Integer.parseInt(reader.readLine());
        while (i > 0){
         if ((i%2)== 0)
            even++;
            else if((i%1==0))
            odd++;
            i=i/10;
        }
                System.out.println("Even: " + even + " " + "Odd: " + odd);
            }
        }

