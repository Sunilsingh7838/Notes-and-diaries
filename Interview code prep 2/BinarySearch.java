public
class BinarySearch {

    private static int Binary_Search(int [] arr, int a){
        int low = 0;
        int high = arr.length;
        int mid = 0;

        while(low<=high){
            mid = (low + high)/2;
        if(a == arr[mid]){
            return mid;
        }
         else if (a < arr[mid]) {
            high = mid -1;
            low = low;
        }
         else{
             low = mid +1;
             high = high;
         }

        }
        return -1;
    }
    public static
    void main(String[] args) {
        int [] marks = {3,4,6,8,9,11,13,18,20};
        int needToFind = 11;

        int result = Binary_Search(marks, needToFind);

        System.out.println("Element "+ needToFind+" found at index is :" + result);
    }
}
