package com.company;

import java.util.Scanner;

public class Practice_02 {
    public static void main(String[] args) {

/*
        Question 16.Write a program to enter the numbers till the user wants and at the end it should display
          the count of positive,negative and zeros entered


        Scanner sc = new Scanner(System.in);
        int number;
        int countPositives =0;
        int countNegatives = 0;
        int countZeros = 0;

        char choice;
        do {

            System.out.print("Enter the Number: ");
            number = sc.nextInt();

            if (number>0){
                countPositives++;
            }
            else if (number<0){
                countNegatives++;
            }
            else {
                countZeros++;
            }

            System.out.println("Do you want to continue y/n ?");
             choice = sc.next().charAt(0);

        }while (choice == 'y' || choice=='Y');

        System.out.println("Thw Positives are : " + countPositives);
        System.out.println("The Negatives are : " + countNegatives);
        System.out.println("The Zeroes are : " + countZeros);


        Question 17.Write a program to enter the numbers till the user wants and at the end the
        program should display the largest and smallest numbers entered.

        int number;
        int maxNum = 0;//Integer.MAX_VALUE;
        int minNum = 0;//Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        char option;
        do {
            System.out.print("Enter the Number : ");
            number = sc.nextInt();

            if (number > maxNum){
                maxNum = number ;
            }
            else if (number < minNum){
                minNum = number;
            }
            System.out.print("Want to Add more value : y/n : ");
            option = sc.next().charAt(0);
        }while ( option == 'y' || option == 'Y');

        System.out.println("The Greatest Number is : " + maxNum);
        System.out.println("The Smallest Number is : " + minNum);


       Question 18. Write a program to print out all Armstrong numbers between 1 and 500. If sum of cubes of each
       digit of the number is equal to the number itself, then the number is called an Armstrong number.
       For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )

        int number;
        int ones;
        int tense ;
        int hundreds ;

        for (number = 1; number <= 500; number ++){

            int tem = number;
            ones = tem % 10;

            tem = tem /10;
            tense = tem % 10;

            tem = tem/10;
            hundreds = tem % 10;

            if (ones*ones*ones + tense*tense*tense + hundreds*hundreds*hundreds == number) {
                System.out.println(" The Armstrong numbers are : " + number);
            }
        }

        Question 19 .Write a program to calculate the sum of following series where n is input by user.
        1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of series you want to Print : ");
         int number = sc.nextInt();
         double sum = 0;
         for (int i = 1; i<= number; i++){
              sum = sum + 1.0/i;
         }
        System.out.println("The sum is : " + sum);

        Question 20. Compute the natural logarithm of 2, by adding up to n terms in the series
        1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n where n is a positive integer and input by user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms of series : ");
       int number = sc.nextInt();

       double sum = 0;
       int sign = 1;
       for (int i = 1; i<=number;i++){

           sum += (1.0 * sign) / i;
           sign *= -1;
       }
        System.out.println("The Log2 is : " + sum);


       Question 21. Write a program to print Fibonacci series of n terms where n is input by user :
        0 1 1 2 3 5 8 13 24 .....

        int firstNum =0,
                secondNum = 1,
                thirdNum;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number between Fibonacci series you want to Print :  ");
        int number = sc.nextInt();

        System.out.print(firstNum + " " + secondNum +" ");
        for (int i = 3; i<= number; i++){

            thirdNum = firstNum + secondNum;
            System.out.print(thirdNum + " ");
            firstNum = secondNum;
            secondNum = thirdNum;
        }
 */


    }
}
