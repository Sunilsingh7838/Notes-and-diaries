/*
        Creating a Calculator with followings features:-
        Addition
        Subtraction
        Multiplication
        Division

        Which throws followings exceptions:-
        Invalid input Exception
        Cannot divide by 0 Exception
        Max Input Exception if any of input is greater than 100000.
        Max Multiplier Reached Exception (Don't allow any multiplication input to be
        greater than 7000).
        */


package com.company;


import java.util.Scanner;

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot add 8 and 9";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }
}

class Cannot_Divide_by_0_Exception extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0.";
    }

    @Override
    public String getMessage() {
        return "Choose Value of b greater than 0.";
    }
}

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "Value cannot be greater than 100000.";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }
}

class MaxMultiplyInputException extends Exception{
    @Override
    public String toString() {
        return "You cannot multiply greater than 7000";
    }

    @Override
    public String getMessage() {
        return "i am getMessage";
    }
}
class Calculator {
    double add ( double a, double b) throws InvalidInputException ,MaxInputException{
        if (a>100000 || b >100000){
            throw new MaxInputException();
        }
        if (a==8 || b==9){
            throw new InvalidInputException();
        }
        return a + b;
    }
    double subtract ( double a, double b) throws MaxInputException{
        if (a>100000 || b >100000){
            throw new MaxInputException();
        }
        return a - b;
    }
    double multiply ( double a, double b) throws MaxInputException, MaxMultiplyInputException{
        if (a>100000 || b >100000){
            throw new MaxInputException();

        }
        else if (a>7000 ||b>7000){
            throw new MaxMultiplyInputException();
        }
        return a * b;
    }
    double division ( double a, double b) throws Cannot_Divide_by_0_Exception, MaxInputException{
        if (a>100000 || b >100000){
            throw new MaxInputException();
        }
        if (b==0){
            throw new Cannot_Divide_by_0_Exception();
        }
        return a  / b ;

    }
}
public class Calculator_with_exception {
    public static void main(String[] args) throws InvalidInputException, Cannot_Divide_by_0_Exception, MaxInputException,MaxMultiplyInputException {

        Calculator cal = new Calculator();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter Value of b :");
        int b = sc.nextInt();
        System.out.println(cal.add(2,3));
        System.out.println(cal.division(5,0));
        System.out.println(cal.division(4,0));
        System.out.println(cal.add(500000,3));
        System.out.println(cal.multiply(7100,40));

    }
}
