package GFG;

public class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
        System.out.println("Node created with value " + val + ".");
    }
}