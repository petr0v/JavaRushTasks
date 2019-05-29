package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public void initialize(String name)
    {
        this.name = name;
        this.age = 1;
        this.weight = 2;
        this.address = null;
        this.color = "brown";
    }
public void initialize (String name,int weight,int age)
{
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "brown";

}
public void initialize (String name,int age){
        this.name = name;
        this.age = age;
        this.weight = 10;
}
public void initialize (int weight,String color)
{
  this.weight = weight;
  this.color = color;
  this.address = null;
  this.name = null;
  this.age =3;
}
public void initialize (int weight,String color,String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
        this.name = null;
        this.age = 2;
}
    public static void main(String[] args) {

    }
}
