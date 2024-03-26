import java.util.LinkedList;

public
class Queue {
    private
    LinkedList<Integer> myQueue = new LinkedList<>();

    public void enqueue (int element){
         myQueue.addLast(element);
    }

    public int dequeu(){
        return myQueue.removeFirst();
    }

    public int size(){
        return myQueue.size();
    }

    public String toString(){
       return myQueue.toString();
    }
    public static
    void main(String[] args) {

        Queue counting = new Queue();
        counting.enqueue(1);
        counting.enqueue(2);
        counting.enqueue(3);
        counting.enqueue(4);
        counting.enqueue(5);
        System.out.println(counting.toString());
       int showdeQueelement =  counting.dequeu();
        counting.dequeu();
        counting.dequeu();
        //System.out.println(showdeQueelement);
        System.out.println(counting.toString());


//        for (int count : counting){
//           // System.out.println(count+ " ");
//        }
    }
}
