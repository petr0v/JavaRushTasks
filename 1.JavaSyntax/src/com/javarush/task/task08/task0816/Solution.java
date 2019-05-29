package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: "фамилия" - "дата рождения".
Удалить из словаря всех людей, родившихся летом.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь HashMap с типом элементов String, Date состоящий из 10 записей.
4. Метод removeAllSummerPeople() должен удалять из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static HashMap<String, Date> createMap() throws ParseException {
        DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", df.parse("JUNE 1 1980"));
        map.put("Petrov", df.parse("March 17 1993"));
        map.put("Petrova", df.parse("September 11 1994"));
        map.put("Kozlina", df.parse("May 5 1922"));
        map.put("Kolox", df.parse("December 11 1965"));
        map.put("Skotina", df.parse("August 07 1243"));
        map.put("Gervant", df.parse("April 11 1000"));
        map.put("Oslina", df.parse("November 13 1987"));
        map.put("Ovchina", df.parse("January 25 1990"));
        map.put("Wolf", df.parse("October 15 2018"));
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        int k = 0;
        for (HashMap.Entry<String, Date> pair : map.entrySet()) {
            Date value = pair.getValue();
            if (value.equals("June"))
                if (value.equals("July"))
                    if (value.equals("August")) {
                        map.remove(value);
                        k++;
                    }
        }

    }

    public static void main(String[] args) {

    }
}
