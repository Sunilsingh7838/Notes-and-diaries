public
class fibonacci_series {

    private static void fibnocciSeries(int n){
        int firstNum = 0, secondNum=1;

        System.out.println("Fibnocci Series till " + n + " is : ");
        for (int i = 1;i<= n;i++){
            System.out.print(firstNum);
            if(i<n){
                System.out.print(", ");
            }
            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }
    }
    public static
    void main(String[] args) {
        int n = 10;
        fibnocciSeries(n);
    }
}
