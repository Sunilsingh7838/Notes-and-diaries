import java.util.List;

class Rectangle{

    int a,b;
    public  Rectangle(int a, int b){
        this.a =b;
        this.b= a;
    }
    public double area(){
        return a * b;
    }
}

class Animal{
    String name, habitat;

    // normal constructor
    public Animal(String name, String habitat){
        this.name = name;
        this.habitat = habitat;
    }
    // copy constructor

    public Animal(Animal otherAnimal){
        this.name = otherAnimal.name;
        this.habitat = otherAnimal.habitat;
    }

    public String getName(){
        return name;
    }
    public String getHabitat(){
        return habitat;
    }
}
public
class Rough_codebook {
    public static
    void main(String[] args) {
    //    List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8)) ;
     //   List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8);
//        System.out.println("Original numbers : " + numbers);
//
//        for (int num: numbers){
//            //System.out.print( num + " ");
//            if (num%2 == 0){
//
//              //  System.out.print(num + " ");
//                System.out.print("Buzz ");
//            }else {
//                System.out.print(num + " ");
//            }
//        }

//        System.out.println(3+5);
//        System.out.println("3"+ "5");
//        System.out.println(3 + "5");
//        System.out.println(3 + 5+ "10Sunil"+ 5);
//        int num1 = 4;
//        int num2 = 5;
//        System.out.println(num1 + num2);

//        String s = "Sun";
//        String s1 = "il";
//        System.out.println(s+s1);
//
//        StringBuffer str = new StringBuffer();
//        str.append("Sun");
//        str.append("flower");
//
//        System.out.println(str);

//        int [] arr = new int[5];
//        arr[0] = 9;
//        arr[1] = 8;
//        for (int num : arr){
//        System.out.print(num + " ");
//        }

//        int [] arr = {1,2,3,4,5,6};
//        int [] cloneArr = arr.clone();
//        for (int Array : cloneArr){
//            System.out.print(Array+ " ");
//        }
//
//      print  Rectangle rect = new Rectangle(2,3);
////        double Area = rect.area(4,5);
//      5  double Area  = rect.area();
//        System.out.println(Area);

        //=========================================
        String hehe = "blabla";
        String name = "Alice";
        int haha = 34;
        int age = 30;
//        String message = String.format("My %s name is %s and I'm  years old.", name,hehe);
//        System.out.println(message);
        //======================================================================
        //Copy Constructor
        // class created above;

        Animal animal = new Animal("Lion","terrestrial");

        Animal animal2 = new Animal(animal);

        System.out.println("Animal 1 " + animal.getName()+" " +  animal.getHabitat());
        System.out.println("Animal 2 " + animal2.getName()+" " + animal2.getHabitat());

    }
}
