package com.javarush.task.task05.task0526;

/*
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Pavel",25,"Astrkhan");
        Man man2 = new Man("Nuaz", 25,"Wall street");
        Woman woman1 = new Woman("Karina",24,"Astrakhan");
        Woman woman2 = new Woman("Mera",32,"Atlantida");

    }

    public static class Man {
        String name;
        int age;
        String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }
    public static class Woman {
        String name;
        int age;
        String address;

        public Woman(String name, int age, String address) {
            this.name= name;
            this.age = age;
            this.address = address;
            System.out.println(name + " " + age + " " + address);
        }
    }
}