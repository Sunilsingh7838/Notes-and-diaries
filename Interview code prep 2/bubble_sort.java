import java.util.Arrays;

public
class bubble_sort {
    static void bubbleSorting(int [] arr){
        for (int i = 0; i<arr.length-1; i++){
            for (int j = 0; j< arr.length-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                }
            }
        }
    }
    public static
    void main(String[] args) {
        int [] array = {4,1,6,3,9,5,8,2};

       // bubbleSorting(array);
       // Arrays.sort(array);
       // System.out.println("Sorted Array is : " + Arrays.toString(array));
    }
}
