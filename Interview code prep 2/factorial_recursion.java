public
class factorial_recursion {

    private static int factorialUsingRecursion(int num){
        if(num == 0 || num == 1){
            return 1;
        }else {
           return num * factorialUsingRecursion(num -1);
        }

    }
    public static
    void main(String[] args) {
        //Q Factorial recursion
        int number = 7;

        int Factorial = factorialUsingRecursion(number);
            System.out.println(" Factorial is : " + Factorial);
    }
}
