package com.mainacad.less1;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //System.out.println("Hello MainAcademy!");
//       Scanner scanner = new Scanner(System.in);
//
//        String line = scanner.nextLine();
//
//        System.out.println(line);


//        squareSb();

//        calculateSquare(10, 30);

        int x = 20;
        int y = 20;

        if(x>y) {
           System.out.println("x < y -> true");
        }
        else if(x==y){
            System.out.println("x = y -> true");
        }
        else{
            System.out.println("x < y -> false");
        }
        int j=0;
        while (j<10){
            System.out.println("Iteretion:" + j);
            ++j;
        }

        for(int i=0; i<10; i+=2){
            System.out.println("Iteretion:" + ++i);
            //++i;
        }


    }

    public static void squareSb() {
        int sideA = 10;
        int sideB = 5;

        int square = sideA*sideB;

        System.out.println(square);

        System.out.println("Площадь прямоугольника = " + square);

        System.out.println("Площадь" + " " + "прямоугольника" + " = " + square);
    }


    public static void calculateSquare(int sideA, int sideB) {
        int square = sideA*sideB;
        System.out.println("Площадь прямоугольника = " + square);

    }
}
