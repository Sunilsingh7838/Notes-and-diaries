import java.util.Arrays;
import java.util.List;

public
class Even_Odd_Sum {
    public static
    void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,
                                              872,
                                              31233,
                                              43,
                                              545,
                                              6,
                                              7,
                                              8,
                                              9);
        int EvenSum = 0, OddSum = 0;
        for (int num : numbers) {
//            System.out.println(num);
//            int even = num % 2 = 0;
            if (num % 2 == 0) {
                EvenSum += num;
            }
            else {
                OddSum += num;
            }
        }
        System.out.println("Sum of Evens is :" + EvenSum);
        System.out.println("Sum of Odds is :" + OddSum);
    }
}
