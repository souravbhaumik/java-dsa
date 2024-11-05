package GFG;

public class main {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node head = new Node(2);
        Node tail = new Node(3);

        node.next = head;
        head.next = tail;
    }
}
