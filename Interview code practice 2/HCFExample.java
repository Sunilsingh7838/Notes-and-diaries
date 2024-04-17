import java.util.Scanner;

public
class HCFExample {
    public static
    int Cal_HCF(int a,
                int b) {
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % a;
        }
        return a;
    }

    public static
    void main(String[] args) {
        // GCD OR HCF
        System.out.println("Welcome to HCF calculator");
        System.out.print("Enter first no. : ");
        Scanner sc = new Scanner(System.in);
        int firstInput = sc.nextInt();

        System.out.print("Enter Second no. :");
        int secondInput = sc.nextInt();

        int result = Cal_HCF(firstInput,
                             secondInput);
        System.out.println("Result : " + result);

        sc.close();
    }
}
