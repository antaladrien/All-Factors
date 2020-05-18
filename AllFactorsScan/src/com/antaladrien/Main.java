package com.antaladrien;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number:");

        int num = myObj.nextInt();
        System.out.print("All factors of the " + num + " = ");
        printFactors(num);
    }

    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        }
        if (number >= 1) {
            for (int i = 1; i <= number; i++) {
                if (number % i == 0) {
                    System.out.print(i + ", ");
                }
            }
        }
    }
}
