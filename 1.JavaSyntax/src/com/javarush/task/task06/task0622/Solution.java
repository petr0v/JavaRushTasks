package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static class BubbleSort {

        public static void main(String[] args) throws Exception {
            int counter, num, array[];

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            num = 5;
            array = new int[5];
            for (counter = 0; counter < num; counter++) {
                array[counter] = Integer.parseInt(reader.readLine());
            }
                bubbleSort(array);
                System.out.print(Arrays.toString(array));
            }
            public static void bubbleSort(int[] num){
                int j;
                boolean flag = true;
                int temp;
                while (flag) {
                    flag = false;
                    for (j = 0; j < num.length - 1; j++) {
                        if (num[j] > num[j + 1]) {
                            temp = num[j];
                            num[j] = num[j + 1];
                            num[j + 1] = temp;
                            flag = true;
                        }
                    }
                }
            }
        }
    }