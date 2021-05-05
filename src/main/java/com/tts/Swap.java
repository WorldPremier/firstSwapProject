package com.tts;

public class Swap {
    public int num1;
    public int num2;


    public void Swap(int num1, int num2) {
        int c = num1;// c  = 10
        int d = num2;// d = 5
//        System.out.println("This block has num1 and num2 with original values.");
//        System.out.println(c);
//        System.out.println(d);


        this.num1 = d;
        this.num2 = c;

        System.out.println("This block will swap num1 and num2 values.");
        System.out.println(num1);
        System.out.println(num2);

    }

}



