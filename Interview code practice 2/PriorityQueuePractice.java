import java.util.PriorityQueue;

public
class PriorityQueuePractice {
    public static
    void main(String[] args) {
        PriorityQueue<Integer> PQ = new PriorityQueue<>();
        PQ.add(11);
        PQ.add(10);
        PQ.add(15);
        PQ.add(1);

        PQ.add(13);
        PQ.add(9);

//        System.out.println(PQ);
        PriorityQueue<String> str = new PriorityQueue<>();
        str.add("Xorones");
        str.add("Pineapple");
        str.add("Grapes");
        str.add("Orange");
        str.add("Apple");

        System.out.println(str);
        System.out.println(str.peek());
//        System.out.println(str.remove());
        System.out.println(str.poll());
        System.out.println(str);

//        System.out.println(PQ.poll());
//        System.out.println(PQ);

    }
}
