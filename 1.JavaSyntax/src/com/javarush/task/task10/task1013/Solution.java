package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
Конструкторы класса Human
Напиши класс Human с 6 полями.
Придумай и реализуй 10 различных конструкторов для него.
Каждый конструктор должен иметь смысл.


Требования:
1. Программа не должна считывать данные с клавиатуры.
2. В классе Human должно быть 6 полей.
3. Все поля класса Human должны быть private.
4. В классе Human должно быть 10 конструкторов.
5. Все конструкторы класса Human должны быть public.
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private int age;
        private boolean sex;
        private int weight;
        private int height;
        private boolean orientational;

        public Human(String name) {
            this.name = name;
        }

        public Human(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Human(boolean sex, boolean orientational) {
            this.sex = sex;
            this.orientational = orientational;
        }

        public Human(int weight, int height) {
            this.weight = weight;
            this.height = height;
        }

        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(int age, int weight, boolean sex) {
            this.age = age;
            this.weight = weight;
            this.sex = sex;
        }

        public Human(String name, boolean orientational) {
            this.name = name;
            this.orientational = orientational;
        }

        public Human(String name, int height, boolean sex) {
            this.name = name;
            this.height = height;
            this.sex = sex;
        }

        public Human(boolean sex, boolean orientational, int age) {
            this.sex = sex;
            this.orientational = orientational;
            this.age = age;
        }

        public Human(String name, int age, int weight, int height) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.height = height;
        }
    }
}
