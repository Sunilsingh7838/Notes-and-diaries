
class Singleton{
    public static Singleton instance = null;
    int a = 11;

    public    Singleton(){};

    public static Singleton getInstance(){
        if ( instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    public void check(){
        System.out.println("this is not static method.");
    }
}

public
class Singleton__private_constructor {
    public static
    void main(String[] args) {

        Singleton r = Singleton.getInstance();
       r.a = r.a+10  ;
       r.check();
        System.out.println(r.a);
        System.out.println();

//        Singleton sg = new Singleton();
//        sg.check();
//        int q = sg.a;
//        System.out.println(q);

    }
}
