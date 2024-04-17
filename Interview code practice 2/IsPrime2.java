import java.util.Scanner;

public
class IsPrime2 {

    public static boolean isPrime(int num){
        if (num ==1){
            return true;
        };
        if (num >=2){
            int squareRoot = (int) Math.sqrt(num);
            for (int i = 2;i<= squareRoot;i++){
                if (num % i ==0){
                    return false;
                }
            }
        }
        return true;
    }
    public static
    void main(String[] args) {
        // Is prime
        System.out.print("Enter number for Prime Check: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        if(isPrime(input)){
            System.out.println("This is Prime.");
        }else {
            System.out.println("This is not Prime.");
        }
    }
}
