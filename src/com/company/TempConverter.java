package com.company;
import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Press C to convert Farenheit to Celsius");
        System.out.println("Press F to convert Celsius to Farenheit");
        System.out.print("Your choice:");

        char ch = sc.next().charAt(0);
        int temp=0, res=0;

        if(ch == 'C')
        {
            System.out.print("Temperature in Farenheit:");
            temp = sc.nextInt();
            res = (temp - 32) * 5 / 9;
            System.out.print("The temperature in Celsius is "+res+".");
        }
        else if(ch == 'F')
        {
            System.out.print("Temperature in Celsius:");
            temp = sc.nextInt();
            res = (temp * 9 / 5) + 32;
            System.out.print("The temperature in Farenheit is "+res+".");
        }
    }
}
