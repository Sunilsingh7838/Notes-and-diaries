import java.util.Random;
import java.util.Scanner;

public
class GussingNumberGame {
    public static
    void main(String[] args) {
        System.out.println("Welcome to Guess The Number Game.");
        int input,num,tries=0;
        Random random = new Random();
         num = random.nextInt(1,
                                 10);

       // System.out.println(num);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your number between 1-10: ");
         input = sc.nextInt();
        do{
        tries ++;
            if (input > num) {
                System.out.println(" My number is too Low!");
            }
            else if (input < num) {
                System.out.println("My number is too High!");
            }
            else {
                System.out.println("You guessed right \nMy num is :" + num);
            }
        }while (input != num);

    }
}
