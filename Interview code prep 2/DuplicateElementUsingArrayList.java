import java.util.ArrayList;
import java.util.List;

public
class DuplicateElementUsingArrayList {
   static List<Integer> findDuplicateInArray(int [] arr){

       List<Integer> duplicates = new ArrayList<>();
       //{4,3,6,1,7,8,3,4,6,9,2, 1, 5}
       // | | | | | | | | | | |  |  |
       // 0 1 2 3 4 5 6 7 8 9 10 11 12
       for (int i = 0; i< arr.length-1;i++){
           for (int j = i + 1; j<arr.length;j++){
               if (arr[i] == arr[j]){
                   System.out.println(arr[j]);
                   duplicates.add(arr[j]);
               }
           }
       }
       return duplicates;
    }
    public static
    void main(String[] args) {
        int [] array = {4,3,6,1,7,8,3,4,6,9,2,1,5};

        List<Integer> duplicates = findDuplicateInArray(array);

        System.out.println("Duplicat elements within Array is :" + duplicates);

    }
}
