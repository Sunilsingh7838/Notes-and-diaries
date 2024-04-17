import java.util.TreeSet;
public
class TreeSetPractice {
    public static
    void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); // Ignored, as TreeSet does not allow duplicates
        System.out.println("TreeSet elements in natural order: " + names);


    }
}
