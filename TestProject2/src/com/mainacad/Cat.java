package com.mainacad;

public class Cat {
    public static int catCount = 0;

    String name;
    Integer age;
    Float weight;
    String color;

    Cat () {
        catCount++;
    }

    Cat( String name){
        this.name = name;
    }

    Cat(String name, int age, float weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    Cat(float weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public void getCatInfo () {
        if (name != null)
        {
            if (age != null && weight != null)
            {
                System.out.println("Домашний кот по имени " + name);
            }
            else
            {
                System.out.println(name);
            }
        }
        else
        {
            System.out.println("Бездомный кот цвета " + color);
        }
    }
}
