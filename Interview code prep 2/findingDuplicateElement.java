public
class findingDuplicateElement {
    // 1|2|3|4|2|6|7|9|2
    // | | | | | | | | |
    // 0|1|2|3|4|5|6|7|8
    private static void  duplicateElement(int [] array){
        for (int i = 0;i<array.length-1; i++){
            for (int j = i + 1;j<array.length;j++){
                if(array[i] == array[j]){
                    System.out.println(array[j]);
                }
            }
        }
    }
    public static
    void main(String[] args) {
        int [] array = {1,2,3,4,2,6,7,9,2};
       duplicateElement(array);

        //System.out.println(element);
    }

}
