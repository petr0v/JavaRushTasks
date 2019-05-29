package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:

Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи


Требования:
1. Программа должна выводить текст на экран.
2. Программа должна считывать значения с клавиатуры.
3. Класс Solution должен содержать один метод.
4. Программа должна вывести фамилию семьи по введенному городу.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, String> families = new HashMap<>();
        while (true) {
            String key = reader.readLine();
            if (key.isEmpty())
                break;
            String value = reader.readLine();
            families.put(key, value);
        }
        String city = reader.readLine();
        for (HashMap.Entry<String, String> pair : families.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (city.equals(key)) {
                System.out.println(value);
            }
        }
    }
}
