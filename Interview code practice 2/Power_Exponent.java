import java.util.Scanner;

public
class Power_Exponent {
    public static double CalculatingPower(int n, int p){
       double result = 1;
       
       for(int i = 1; i<=p; i++){
           result *= n ;
       }
        return result;
    }
    public static
    void main(String[] args) {
        // Power to another input

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();

        System.out.print("Enter Power: ");
        int power = sc.nextInt();
        
        double result = Power_Exponent.CalculatingPower( num, power);
        System.out.println("Ans : " + result);
    }
}
