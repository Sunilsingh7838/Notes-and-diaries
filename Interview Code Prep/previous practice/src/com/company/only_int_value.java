package com.company;

import java.util.Scanner;

public class only_int_value {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc =new Scanner(System.in);

        while (!sc.hasNextInt()){
            System.out.print("Invalid input ! Enter integer :");
            sc.next();
        }
        int num = sc.nextInt();
        System.out.println("Your number is: " + num);
    }
}
