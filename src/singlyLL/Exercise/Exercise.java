package singlyLL.Exercise;

public class Exercise {
    public static Node head;
    public static Node tail;
    public static int size;

    /**
     * The `create` function in Java creates a new Node with a specified value and sets it as the head
     * and tail of the linked list.
     * 
     * @param val The parameter `val` in the `create` method represents the integer value that will be
     * stored in the newly created `Node` object. This value will be assigned to the `value` field of
     * the `Node` object before it is added to the linked list.
     * @return The `create` method is returning the head node of the linked list that was created with
     * the specified value.
     */
    public static Node create (int val) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = val;
        head = tail = node;
        size = 1;
        return head;
    }

    public static void push(int val) {
        if (head == null){
            create(val);
        } else {
        Node newNode = new Node();
        newNode.value = val;
        newNode.next = null;
        tail.next = newNode;
        tail = newNode;
        size++;
        }
    }

    public static Node pop() {
        if (head == null) {
            System.out.println("The SLL does not exist");
            return null;
        }
        Node remNode;
        Node curNode;
        if (head == tail) {
            remNode = head;
            head = tail =null;
        } else {
            curNode = head;
            while (curNode.next != tail) {
                curNode = curNode.next;
            }
            remNode = curNode.next;
            curNode.next = null;
            tail = curNode;
        }
        size--;
        return remNode;
    }
}