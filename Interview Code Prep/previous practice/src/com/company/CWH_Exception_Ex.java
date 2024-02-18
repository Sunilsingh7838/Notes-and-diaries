package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidEx extends InputMismatchException {
    @Override
    public String toString(){
        return "/n/InvalidEx "+getMessage();
    }

    @Override
    public String getMessage() {
        return "Please enter a valid operation";
    }
}

class ArithmeticEx extends ArithmeticException{
    @Override
    public String toString() {
        return "ArithmeticEx "+getMessage();
    }

    @Override
    public String getMessage() {
        return "number can't be divided by Zero";
    }
}

class MaxInputEx extends InputMismatchException{
    @Override
    public String toString() {
        return "/n/MaxInputEx "+getMessage();
    }

    @Override
    public String getMessage() {
        return "input is greater is than 100000";
    }
}
class MaxMultiEx extends ArithmeticException{
    @Override
    public String toString() {
        return "/n/MaxMultiEx "+getMessage();
    }

    @Override
    public String getMessage() {
        return "multiplication input to be greater than 7000";
    }
}

class CalculatorJava{

    Scanner sc = new Scanner(System.in);

    public void cal(){

        System.out.println("press");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Divide");
        int systemnum = sc.nextInt();
        if (systemnum == 1) {
            add();
        }
        else if(systemnum == 2){
            sub();
        }
        else if(systemnum == 3){
            multiply();
        }
        else if(systemnum == 4){
            divide();
        }
        else{
            System.out.println("invalid number");
        }


    }

    public void add() throws InvalidEx, MaxInputEx{
        System.out.println("enter number to add");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if(num1 == 8 || num2 == 9){
            throw new InvalidEx();
        }
        if(num1 > 100000 || num2 > 100000){
            throw new MaxInputEx();
        }
        System.out.println(num1+num2);
    }
    public void sub() throws MaxInputEx{
        System.out.println("enter number to sub");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        if(num1 > 100000 || num2 > 100000){
            throw new MaxInputEx();
        }
        System.out.println(num1-num2);
    }
    public void multiply() throws MaxInputEx,MaxMultiEx{
        System.out.println("enter number to multiply");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if(num1 > 7000 || num2 > 7000){
            throw new MaxMultiEx();
        }
        else if(num1 > 100000 || num2 > 100000){
            throw new MaxInputEx();
        }
        System.out.println(num1*num2);
    }
    public void divide() throws MaxInputEx,ArithmeticEx{
        System.out.println("enter number to divide");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        if(num2 ==0){
            throw new ArithmeticEx();
        }
        else if(num1 > 100000 || num2 > 100000){
            throw new MaxInputEx();
        }
        System.out.println(num1/num2);
    }
}

public class CWH_Exception_Ex {
    public static void main(String[] args) {

        CalculatorJava customCal = new CalculatorJava();
        customCal.cal();
    }
}