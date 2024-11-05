package Stack;

public class Main {
    public static void main(String[] args) {

        // Creating Stack object
        Stack stack = new Stack(3);

        // Checking if the Stack is empty or not
        if (stack.isEmpty()) {
            System.out.println("The Stack is empty");
        } else {
            System.out.println("The Stack is not empty");
        }
        // Checking if the Stack is full or not
        if (stack.isFull()) {
            System.out.println("The Stack is full");
        } else {
            System.out.println("The Stack is not full");
        }
    }
}
