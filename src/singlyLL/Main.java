package singlyLL;

public class Main extends SinglyLinkedList {
    public static void main(String[] args) {
        create(3);
        System.out.println(head.value);
        insert(6,1);
        insert(7,3);
        System.out.println(head.next.next.value);
        traverse();
        search(3);
        System.out.println(search(3));
    }
}