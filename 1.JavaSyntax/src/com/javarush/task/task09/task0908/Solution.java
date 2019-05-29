package com.javarush.task.task09.task0908;

/* 
Исключение при работе со строками
Перехватить исключение (и вывести его на экран), указав его тип, возникающее при выполнении кода:
String s = null;
String m = s.toLowerCase();


Требования:
1. Программа должна выводить сообщение на экран.
2. В программе должен быть блок try-catch.
3. Программа должна отлавливать исключения конкретного типа, а не все возможные (Exception).
4. Выведенное сообщение должно содержать тип возникшего исключения.
5. Имеющийся код в методе main не удалять.
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        try {
            method1();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    //напишите тут ваш код
    public static void method1() throws NullPointerException {
        String s = null;
        String m = s.toLowerCase();

        //напишите тут ваш код
    }
}