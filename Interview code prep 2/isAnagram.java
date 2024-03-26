import java.util.Arrays;

public
class isAnagram {
   private static boolean isAnagramOrNot(String firstString, String lastString){
       String cleanFirstString = firstString.replaceAll("\\s","").toLowerCase();
       String cleanLastString = lastString.replaceAll("\\s","").toLowerCase();

       if(cleanFirstString.length() != cleanLastString.length()){
           return false;
       }

        char [] charFirstString = cleanFirstString.toCharArray();
        char [] charLastString  =cleanLastString.toCharArray();

       Arrays.sort(charFirstString);
       Arrays.sort(charLastString);
       return Arrays.equals(charFirstString, charLastString );



   }
    public static
    void main(String[] args) {
        String str1 = "qwrety";
        String str2 = "qwert  Y";

        if(isAnagramOrNot(str1,str2)){
            System.out.println(str1 + " and "+ str2 +" are Anagrams!");
        }else {
            System.out.println(str1 + " and "+ str2 +" are not Anagrams!");
        }
    }
}
