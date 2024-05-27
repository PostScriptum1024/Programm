package Plus_examples;

import node.Node;

public class Example9_6 {

    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        Node ref = head;

        System.out.println("Исходный список: ");
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }

        head = head.next;

        ref = head;
        System.out.println("Новый список: ");
        while(ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
