package com.javarush.task.task08.task0824;

/* 
Собираем семейство
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Выведи все объекты Human на экран (Подсказка: используй метод toString() класса Human).


Требования:
1. Программа должна выводить текст на экран.
2. Класс Human должен содержать четыре поля.
3. Класс Human должен содержать один метод.
4. Класс Solution должен содержать один метод.
5. Программа должна создавать объекты и заполнять их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей и выводить все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        Human son1 = new Human("Mike",true,14);
        Human son2 = new Human("Paul",true,12);
        Human girl = new Human("Kill",false,4);
        Human father = new Human("Lok", true, 34,son1,son2,girl);
        Human mother = new Human("Betty", false, 34,son1,son2,girl);
        Human granpa = new Human("Bob", true, 68,father);
        Human granpa2 = new Human("Ted", true, 72,mother);
        Human granma = new Human("Kim", false, 65,father);
        Human granma2 = new Human("Katy", false, 63,mother);

        ArrayList<Human> humans = new ArrayList<>(Arrays.asList(granpa,granpa2,granma,granma2,father,mother,son1,son2,girl));
        for(Human s : humans)
            System.out.println(s);
    }
    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(0);

        }
        Human(String name, boolean sex, int age,Human...children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<>(Arrays.asList(children));
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;

        }

    }

}
