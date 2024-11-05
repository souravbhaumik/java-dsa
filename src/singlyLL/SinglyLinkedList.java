package singlyLL;

public class SinglyLinkedList {
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

    /**
     * The `insert` function adds a new node with a specified value at a given location in a linked
     * list.
     * 
     * @param val The `val` parameter in the `insert` method represents the value that you want to
     * insert into the linked list at a specified location.
     * @param loc The `loc` parameter in the `insert` method represents the index at which you want to
     * insert a new node with the specified value in a linked list. If `loc` is 0, the new node will be
     * inserted at the beginning of the list. If `loc` is greater than
     */
    public static void insert(int val, int loc) {
        Node node = new Node();
        node.value = val;
        if (head == null) {
            create(val);
            return;
        } else if (loc == 0) {
            node.next = head;
            head = node;
        } else if (loc >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node tempNode = head;
            int index = 0;
            while (index < loc-1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = tempNode.next;
            tempNode.next = node;
            node.next = nextNode;
        }
        size++;
    }

    /**
     * The `traverse` function prints the values of nodes in a singly linked list in order.
     */
    public static void traverse() {
        if (head == null) {
            System.out.println("The Single Linked List is not exist");
        } else {
            Node tempNode = head;
            for (int i=0; i<size; i++) {
                System.out.print(tempNode.value);
                if (i != size-1) {
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("\n");
    }

    /**
     * The `search` function in Java searches for a specific value in a linked list and returns true if
     * found, along with the location, or false if not found.
     * 
     * @param val The `val` parameter in the `search` method represents the value that you are
     * searching for in the linked list. The method iterates through the linked list nodes to find a
     * node with the specified value (`val`). If the node with the value is found, it prints a message
     * indicating the location
     * @return The search method returns a boolean value - true if the value is found in the linked
     * list, and false if the value is not found.
     */
    public static boolean search(int val) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == val) {
                    System.out.println("Found Node " + val + " at location " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("Node not found.");
        return false;
    }

    /**
     * The delete function removes a node at a specified location in a singly linked list.
     * 
     * @param loc The `loc` parameter in the `delete` method represents the location of the node that
     * needs to be deleted in a singly linked list. The method checks various conditions based on the
     * value of `loc` to determine which node to delete from the linked list. If `loc` is 0,
     */
    public static void delete(int loc) {
        if (head == null) {
            System.out.println("Single Linked List does not exist.");
            return;
        } else if (loc == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
        } else if (loc >= size) {
            Node tempNode = head;
            for (int i=0; i < size-1; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                tail = head = null;
                size--;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
        } else {
            Node tempNode = head;
            for (int i = 0; i < loc-1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
        }
    }

    /**
     * The `delete()` function sets the head and tail of a single linked list to null and prints a
     * success message. Which will delete the entire Singly Linked List from memory.
     */
    public static void delete() {
        head = tail = null;
        System.out.println("Single Linked List has been deleted successfully.");
    }
}
