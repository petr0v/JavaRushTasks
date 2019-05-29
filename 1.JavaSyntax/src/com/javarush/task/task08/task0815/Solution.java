package com.javarush.task.task08.task0815;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* 
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Петров", "Павел");
        map.put("Петро", "Карина");
        map.put("Петрова", "Лафи");
        map.put("Иванов", "Иван");
        map.put("Германов", "Герман");
        map.put("Магарамов", "Магарам");
        map.put("Сидоров", "Cидр");
        map.put("Александров", "Александр");
        map.put("Максимов", "Максим");
        map.put("Павлов","Павел");

        return map;

    }


    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int k = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String value = pair.getValue();
            if (value.equals(name)) {
                k++;
            }
        }
        return k;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int l = 0;
        for (Map.Entry<String, String> pair : map.entrySet()) {
            String key = pair.getKey();
            if (key.equals(lastName)) {
                l++;
            }
        }
        return l;
    }

    public static void main(String[] args) throws IOException {
    }
}
