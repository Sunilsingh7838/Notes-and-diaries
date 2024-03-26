abstract
class Car {
    public
    void Start() {
        System.out.println("Car is Starting......[Method form Car class]");
    }

    public
    void Moving() {
        System.out.println("Car is Running......[Method form Car class]");
    }

}

// Inheritance
class Tata extends Car {
    public static
    void Model() {
        System.out.println("This Model is Nexon....[Method form tata  class " +
                                   "which extended form Car class]");
    }

    public static
    void features() {
        System.out.println("This eqquped with abs breaking system." +
                                   "[Method form tata class which extended form Car ");
    }

    @Override
    public void Moving(){
        System.out.println("Moving Smooth.[This is override polymorphism" +
                                   " (changed the method of super class");
    }
}

// polymorphism
class Calculator {
    int multiply(int a,
                 int b) {
        return a * b;
    }

    double multiply(double x,
                    double y) {
        return x * y;
    }
}

public
class Inheritence_Polymorphism {
    public static
    void main(String[] args) {
        System.out.println("Example of Inheritance");
        Tata tataCars = new Tata();
        tataCars.Moving();
        tataCars.Start();
        tataCars.Model();
        tataCars.features();
        System.out.println("++++++++++++++++++++++++++");

        System.out.println("Example of Polymorphism");
        Calculator calci = new Calculator();
        int multiple = calci.multiply(3,
                                      3);
        System.out.println(multiple);

        double multiple2 = calci.multiply(1.1,
                                          3.3);
        System.out.println(multiple2);
        System.out.println("++++++++++++++++++++++++++++");
    }
}
