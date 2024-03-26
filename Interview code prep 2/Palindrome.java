public
class Palindrome {
    private static boolean isPalindrome(String str){
        String  cleanstr = str.replaceAll("\\s","").toLowerCase();
        //String revstr = reverseString(cleanstr);

        return cleanstr.equals(new StringBuilder(cleanstr).reverse().toString());
    }

    private static String cleanStringAndLowerCase(String str){
        return str.replaceAll("\\s", "").toLowerCase();
    }

    private static String reverseString(String str){
        StringBuilder reversedString = new StringBuilder(str);

        return reversedString.reverse().toString();
    }
    public static
    void main(String[] args) {
        String isPalin = "Racecar";

        if (isPalindrome(isPalin)) {
            System.out.println("This is Palindrome");
        }
        else {
            System.out.println("Not Palindrome.");
        }
    }



    }

