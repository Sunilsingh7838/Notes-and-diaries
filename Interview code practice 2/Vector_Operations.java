import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public
class Vector_Operations {
    public static
    void main(String[] args) {
        // Operations using Vector

        Vector<String> vector  = new Vector<>(4,4);
        vector.add("Carrot");
        vector.add("Potato");
        vector.add("Ginger");
        vector.add("Garlic");
        vector.add("Onion");
        vector.add("Cucumber");
       // vector.add(1);     // wrong way
//        vector.setSize(4);

//        System.out.println(vector.get(2));
        System.out.println(vector);

//        List<String> fruits = new ArrayList<>();
//
//        fruits.add("Orange");
//        fruits.add("guava");
//        System.out.println(fruits);

//        String[] items = {"Chair","Table", "Bottle"};
//
//        List newItems = new ArrayList<>(Arrays.asList(items));
//
//        newItems.add("Jar");
//        System.out.println(newItems);

//        for (Object i: newItems){
//            System.out.println(i);
//        }

    }
}
