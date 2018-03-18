package com.mainacad;
import java.util.Scanner;
public class Solution {
// Задача 3
/*
    public static int a = 1;
    public static int b = 3;
    public static int c = 9;
    public static int d = 27;

     public static void main(String[] args) {
         int result = - a + b - c + d;
         System.out.println(result);
     }

*/
//  Задача4
/*
    public static void main(String[] args)
    {
        int a = 3;
        //int a = 10;
        int b = 6;
        //int b = 12;
        //int summa = 1 + a + b;
        //int summa = 2 + a + b;
        int summa = 3 + a + b;
        //int summa = 4 + a + b;

        System.out.println("summa = " + summa);

    }
*/

//Задача №5
/*
    public static void main(String[] args)
    {
        //String s = "15";
        int a = 5;
        //int z = 18;
        int d = 18;
        int c = a + d;
        //String b = " better then "; or
        int b = 10;
        System.out.println(a + b + c);
    }
*/

//Задача 6
/*
    public static void main(String[] args)
    {
        print ("привет");
    }

    public static void print(String text)
    {
        for (int i = 1; i <= 4; i++)
        {
            System.out.println(text);
        }
    }
*/

//Задача 7
/*
    public static void main(String[] args) {
        salary(1500);
    }
    public static void salary(int a)
    {
        int b = a + 100;
    System.out.println("Твоя зарплата составляет: " + b + " долларов в месяц.");
    }
*/


//Задача8
/*
    public static void main(String[] args)
    {
        printCircleLength(12);
    }
    public static void printCircleLength(double radius)
    {
        double PI = 3.14;
        double l = 2 * PI * radius;
        System.out.println(l);
    }
*/

//Задача 9
/*
    public static int min(int a, int b)
    {
        if(a<b) return a;
        else return b;

    }

    public static void main(String[] args) throws Exception
    {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));
    }
*/

//Задача 10
/*
    public static void main(String[] args)
    {
        int num = 8;
        check (num);
    }

    private static void check (int n)
    {
        if (n%2==0) System.out.println("Число " + n + " четное.");
        else System.out.println("Число " + n + " нечетное.");
    }
*/

// Задача 11
/*
    public static void main(String[] args)
    {
        float m = 25.3f;
        float n = 8.2f;
        final float k = 10f;
        float a = Math.abs(k-m);
        float b = Math.abs(k-n);

        if(a<b) System.out.println(m);
        else   System.out.println(n) ;
    }
*/

    //Задача 13
/*
    public static void main(String[] args)
    {
      System.out. println("Введите число 1:  ");
      Scanner a = new Scanner(System.in);
      int num = a.nextInt();
      if(num==1) System.out.print("Вы ввели число 1");
      else System.out.println("Вы ввели число не равное 1");
    }
*/

// Задача про Cat

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        Cat cat3 = new Cat();
        Cat cat4 = new Cat();
        System.out.println(Cat.catCount);

        cat1 = new Cat("Vova");
        cat1.getCatInfo ();
        cat2 = new Cat("Petya", 5, 4.5f);
        cat2.getCatInfo ();
        cat3 = new Cat(4, "gray");
        cat3.getCatInfo ();
    }
}
