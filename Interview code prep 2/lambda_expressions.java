import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperations{
    int operate(int a, int b);
}

public
class lambda_expressions {
    public static
    void main(String[] args) {
        MathOperations addition = (a, b) -> a + b;
//        int add = addition(4,5);

        int add = addition.operate(12,12);
        System.out.println(add);
//        System.out.println("Addition is : " + addition.operate(4,5));

        MathOperations multiply = (b, c) -> b * c;
//        System.out.println("Multiplication is :" + multiply.operate(5,6));

        List<Integer> num = List.of(1,
                                    2,
                                    3,
                                    4,
                                    5);
        List<String> names = Arrays.asList("Alex",
                                           "Henry",
                                           "Emma",
                                           "stuart","edward");

//        num.forEach(numbers -> System.out.print(numbers + " "));
//        names.stream().filter(name -> name.startsWith("E"))
//                .forEach(System.out::println);


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

// Using lambda expression with Stream API to filter and map elements
        List<Integer> squares = numbers.stream()
                                        .filter(n -> n % 2 == 0)
                                        .map(n -> n * n)
                                        .collect(Collectors.toList());

        System.out.println(squares);



    }



}
