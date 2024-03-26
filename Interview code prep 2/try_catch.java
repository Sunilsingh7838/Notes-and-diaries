public
class try_catch {
    public static
    void main(String[] args) {
        int a,b;
        a = 1;
        b = 0;
        try {
            float devide = a/b;
            System.out.println(devide);
        }catch (Exception e){
            System.out.println("Error Occured : " + e);
        }finally {
            System.out.println(" Code Exited........");
        }
    }
}
