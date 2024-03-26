import com.sun.jdi.ByteType;

import java.util.Random;

public
class Conversions {
    public static
    void main(String[] args) {

//        String str = "Hello";
//        boolean num = false;

//        System.out.println("str is : " +((str instanceof String)?"String":"Not String"));


//        String [] names = {"Alex", "Allen","Emma","Edward"};
//        boolean flag1 = false;
//
////        Class<?> var = array.getClass();
//        Class<?> var2 = names.getClass();
//        Class<?> var3 = Boolean.class;
////        System.out.println("The type of array is : " +var.getName());
//        System.out.println("The type of names is : " + var2.getName());
//        System.out.println("The type of flag1 is :" +var3.getName());

        //=============================================================================
        //Conversions
//        String a = "10";
//
//        Integer strA = Integer.parseInt(a);
//        System.out.println("the strA is :" + ((strA instanceof Integer)?"Integer":""));

        //===============================
//        String b = "123";
//
//        int Bstr = Integer.valueOf(b);
//        System.out.println("sfjslfj  " +Bstr);


//        String str = "1234";
//
//        int num1 = Integer.valueOf(str);
//        System.out.println("Integer using"
//                                   + " valueOf() = "
//                                   + num1);
        //====================================================

//        double d = 100.64;
//        long l = (long) d;
//
//        int i = (int)l;
//        System.out.println(l);
//        System.out.println(l instanceof );
//        double id = 18.34532335235;
//        float f = (float) id;
//        System.out.println(f);

//        float fg = 13123.2234f;
//        float fg1 = 13123.2234f;
//        float fg2 = 13123.2234f;
//        double df = (float)fg;
//        double df1 = (float)fg;
//        double df2 = (float)fg;
//        System.out.println(df);
//        System.out.println(df1);
//        System.out.println(df2);
//========================================
        //byte b,b1;

//        int i = 257;
//        double d = 323.142;
//
//        b = (byte)i;
//        b1 = (byte)d;
//        System.out.println("int i = " + i+ "\nbyte b of i = " +b);
//        System.out.println("double d = " + d + "\n byte of d ="+ b1);
//=====================================================================
//        byte b = 42;
//        char c = 'a';
//        short s = 1024;
//        int i = 50000;
//        float f = 5.67f;
//        double d = .1234;

        // The Expression
      //  double result = (f * b) + (i / c) - (d * s);

        // Printing the result obtained after
        // all the promotions are done
       // System.out.println("result = " + result);

        // Declaring byte array
        byte b1 = 50;

        // Type casting int to byte
        b1 = (byte)(b1 * 2);

        // Display value in byte
//        System.out.println(b1);

        Random random = new Random();

        for(int i = 0; i<10;i++){
        int rn = random.nextInt(10)+ 1;
        System.out.println("The Random Number is : " +rn);
        }
    }
}
