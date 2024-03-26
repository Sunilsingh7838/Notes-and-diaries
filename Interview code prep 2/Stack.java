import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public
class Stack {
    public static
    void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();
//        Stack stack = new Stack<>();
//        Deque<Integer> stack = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

//        stack.add(1);
//        stack.add(2);
//        stack.add(3);
        System.out.println(stack);
        int poppedElement = stack.pop();
        System.out.println(poppedElement);
        System.out.println(stack);
//        stack.add(4);
//        stack.add(5);
//        stack.add(6);
        

    }
}
