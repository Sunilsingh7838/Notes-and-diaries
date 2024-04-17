import java.util.Scanner;

public
class CountPositiveNegativsAndZeros {
    public static
    void main(String[] args) {
        char response;
        int totalPositive = 0, totalNegative = 0, totalZero = 0,input;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter no. :");
            input = sc.nextInt();
            if (input < 0) {
                totalNegative++;
            }
            else if (input > 0) {
                totalPositive++;
            }else {
                totalZero++;
            }
            System.out.print("Like to add more (Y/N) ");
            response = sc.next().charAt(0);

        } while (response == 'Y' || response == 'y');

        System.out.println("Positives No. :" + totalPositive);
        System.out.println("Negatives No. :" + totalNegative);
        System.out.println("Zeros No. : " + totalZero);
    }
}
