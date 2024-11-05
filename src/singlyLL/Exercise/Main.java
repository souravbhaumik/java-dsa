package singlyLL.Exercise;

public class Main extends Exercise {
    public static void main(String[] args) {
        push(5);
        System.out.println(head.value);
        System.out.println(size);
        System.out.println(tail.value);

        push(10);
        System.out.println(size);
        System.out.println(head.value);
        System.out.println(head.next.value);
        System.out.println(tail.value);
    }
}
