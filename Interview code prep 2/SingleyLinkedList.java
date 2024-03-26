class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList{
    Node head;
    SinglyLinkedList(){
    this.head = null;

    }
    public void insertAtBeggening(int data){
        Node newNode =new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void display(){
        Node current = head;
        while (current != null){
            System.out.print(current.data + " -> ");
            current = current .next;
        }
        System.out.println("null");
    }
//    public void reverseList(){
//        Node current = head;
//        for (int i = 0; i>=current.size(); i--){
//            System.out.println(current.data);
//        }
//    }
}

public class SingleyLinkedList {
    public static
    void main(String[] args) {

        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtBeggening(11);
        singlyLinkedList.insertAtBeggening(12);
        singlyLinkedList.insertAtBeggening(13);
        System.out.println("data inserted..........");
        singlyLinkedList.display();

    }
}