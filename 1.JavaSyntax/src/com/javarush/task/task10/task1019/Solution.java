package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public class SomePhone {

        private int year;
        private String company;

        public SomePhone(int year, String company) {
            this.year = year;
            this.company = company;
        }

        private void openConnection() {
            //findComutator
            //openNewConnection...
        }

        public void call() {
            openConnection();
            System.out.println("Вызываю номер");
        }

        public void ring() {
            System.out.println("Дзынь-дзынь");
        }

    }
}
