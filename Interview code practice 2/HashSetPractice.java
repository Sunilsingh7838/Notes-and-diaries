import java.util.HashSet;

public
class HashSetPractice {
    public static
    void main(String[] args) {
        // Hash Set

        HashSet<Integer> hashset= new HashSet();

        hashset.add(10);
        hashset.add(2);
//        hashset.add(3);
        hashset.add(5);
        hashset.add(4);
        hashset.add(5);
        hashset.add(0);
        hashset.remove(10);
        System.out.println(hashset);
    }
}
