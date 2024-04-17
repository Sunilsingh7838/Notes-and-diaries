import java.util.Scanner;

public
class LoopAddition {
    public static
    int Addition(int a,
                 int b) {
        return a + b;
    }

    public static
    void main(String[] args) {
        // Addition in loop
        char userInput, reUserInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Addition Chamber");

        do{
            System.out.print("Enter no.:");
            int input1 = sc.nextInt();

            System.out.print("Enter no.:");
            int input2 = sc.nextInt();

            int sum = input1 + input2;
            System.out.println(sum);

            System.out.println("Do yu want to continoue Y/N");
             userInput = sc.next().charAt(0);

        }while ( userInput == 'Y' || userInput == 'y');
        System.out.println("Thank you!");
        sc.close();;

    }
}
