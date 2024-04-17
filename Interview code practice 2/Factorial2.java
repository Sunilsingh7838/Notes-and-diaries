import java.util.Scanner;

public
class Factorial2 {

    int num;

    //    public Factorial2(int num){
//        this.num = num;
//    }
    public static
    int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        else {

            return n * fact(n - 1);
        }
    }

    public static
    void main(String[] args) {
        // factorial  using recursion

        System.out.print("Enter Number for factorial: ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = Factorial2.fact(number);
        System.out.println(result);


    }
}
