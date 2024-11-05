package doublyLL;

public class doublyLinkedList {
    doublyNode head;
    doublyNode tail;
    int size;

    public doublyNode createDLL(int nodeValue) {
        head = new doublyNode();
        doublyNode newNode = new doublyNode();
        newNode.value = nodeValue;
        newNode.next=null;
        newNode.prev=null;
        head = newNode;
        tail = newNode;
        size = 1;
        System.out.println("Node => " + head.value);
        return head;
    }

    public void insertDLL(int nodeValue, int location) {
        doublyNode newNode = new doublyNode();
        newNode.value = nodeValue;
        if (head == null) {
            createDLL(newNode.value);
            return;
        }
        if (location == 0) {
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
        } else if (location >= size) {
            newNode.next = null;
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        } else {
            doublyNode tempNode = new doublyNode();
            
        }
    }
}