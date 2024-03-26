import java.util.Scanner;

class isPrime {

    private static
    boolean isPrimeOrNot(int x) {
        if (x <= 1) {
            return true;

        }
        if (x ==2){
            return false;
        }

        int underRoot = (int) Math.sqrt(x);
        for (int i = 2; i <= underRoot; i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static
    void main(String[] args) {
//        int num = 11;
//        double squareRoot = Math.sqrt(num);
//
//        System.out.println("The square root of " + num + " is: " + squareRoot);
        // int num = 5;
        //double squared = Math.pow(num, 100);

        //  System.out.println("The square of " + num + " is: " + squared);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to check Prime or not: ");
        int num = sc.nextInt();

        if (isPrimeOrNot(num)) {
            System.out.println(num + " is not Prime number.");
        }
        else {
            System.out.println(num + " is Prime number.");
        }
        sc.close();
    }
}
