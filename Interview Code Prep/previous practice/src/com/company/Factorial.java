package com.company;

//Recursive approach
public class Factorial {
    /*static int factorial (int n ){
        if (n==0 || n==1){
            return 1;
        }
        else {
            return n * factorial(n-1);
        }
    }*/

    static int iterative_factorial (int n){

        if (n==0 || n==1){
            return 1;
        }
        else{

            int product = 1;
            for (int i = 1; i<=n; i++){
                product *= i;

            }
            return product;


        }


    }

    public static void main(String[] args) {

        int n = 5;
//        System.out.println("The value of factorial 5 is : " + factorial(n));
        System.out.println("The value of factorial 5 is : " + iterative_factorial(n));

    }
}
