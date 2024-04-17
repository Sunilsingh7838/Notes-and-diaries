import javax.swing.*;
import java.util.Scanner;

public
class Digit_Reversal {
    public static
    void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String input = String.valueOf(sc.next());

//        char[] ArrInput = String.valueOf(input).toCharArray();
        char[] ArrIp = input.toCharArray();
        int length = ArrIp.length-1;
//        int inputLength = ArrInput.length()-1;
        for (int i = length; i>=0;i--){
            System.out.print(ArrIp[i] + " ");
        }
//        for (char c: ArrInput){
//            System.out.print(c );
//        }
//        System.out.println(ArrInput);
//        String Arr = String.valueOf(Integer.valueOf(input));
//        String [] ArrInput =
    }
}
