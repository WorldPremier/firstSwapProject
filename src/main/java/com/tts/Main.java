package com.tts;
import java.util.*;

public class Main {
    static void showMessage(double a, double b, int count){
        double sums = a + b;
        for(int i = 0; i < count; i ++){
            System.out.println(sums);
        }
    }



    public static void main(String[] args) {

        showMessage(7.5, 1.5, 5);

        float a;
        float b;
        Swap swap = new Swap();
        swap.num1 = 150;
        swap.num2 = 100;

        System.out.println("This block has num1 and num2 with original values.");

        System.out.println(swap.num1);
        System.out.println(swap.num2);

        swap.Swap(100,150);

        try{
            //Instead of allowing try to execute the exception.
            //I will create a swap class where it switches the zero from denominator to numerator.
            //swap.num1 is basically referencing the method and reassign it to a value.
            swap.num1 = 0;
            swap.num2 = 12;
            System.out.println("this message reads after try block");
            swap.Swap(swap.num1, swap.num2);
            int sum = swap.num1/swap.num2;
            System.out.println(sum);



        }catch(Exception ex){
            ex.getMessage();
            ex.printStackTrace();
            System.out.println("this message reads under catch block");
        }finally {
            System.out.println("This message reads regardless of output under finally block of code");

        }
    }
}
