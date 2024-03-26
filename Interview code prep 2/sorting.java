import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public
class sorting {
    static  void sortingTheArray(int [] array){
        for(int i = 0; i<array.length-1;i++){
            for (int j = i +1;j< array.length ; j++){
                if (array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

//    private static int oddAndEvenNumbers(int [] arr){
//
//    }
    public static
    void main(String[] args) {
        // sorting


        //sortingTheArray(arr);

        //System.out.println("Sorted Array is :" + Arrays.toString(arr));

        //Set<Integer> arr1 = new HashSet<Integer>(Arrays.asList(3,2,4,5,1,7,6,8,9,2,4,3,7));

        int [] arr = {2,3,5,1,7,6,8,9,2,4,3,7};

        Set<Integer> evenList = new HashSet<>() ;
        Set<Integer> oddList = new HashSet<>() ;
        //int even ;
        for (int i = 0; i<arr.length-1;i++){
            if (arr[i]% 2 == 0){
                evenList.add(arr[i]);
            }else {
                oddList.add(arr[i]);
            }
        }
        System.out.print("Even numbers :");
        for (Integer even :evenList ){
            System.out.print(even + " ");
        }
        System.out.println();
        System.out.print("Odd numbers :");
        for (Integer odd :oddList ){
            System.out.print(odd + " ");
        }
    }
}
