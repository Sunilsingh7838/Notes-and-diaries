import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public
class Linkedlist_in_list_and_deque {
    public static
    void main(String[] args) {

        LinkedList<String> abc = new LinkedList<>();

        abc.add("Apple");
        abc.addFirst("Banana");
        abc.addFirst("Orange");
        abc.add("PineApple");

        Collections.sort(abc, Comparator.reverseOrder());
        System.out.println(abc);
    }
}
