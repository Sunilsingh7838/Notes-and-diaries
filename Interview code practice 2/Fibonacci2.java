public
class Fibonacci2 {
    public static void fibo(int x){
        int next,first_num =0,second_num =1;
        for (int i= 0;i<=x-1;i++){
        System.out.print(first_num);
        if (i<x-1){
            System.out.print(", ");
        }
            next = first_num + second_num;
            first_num= second_num;
            second_num = next;
        }
    }
    public static
    void main(String[] args) {
        Fibonacci2.fibo(10);
    }
}
