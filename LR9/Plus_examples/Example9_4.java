package Plus_examples;

import node.Node;

public class Example9_4 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        System.out.println("Исходный список: ");
        Node ref = head;
        while(ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }

        Node newTail = new Node(78, null);
        ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;

        System.out.println("Изененный список: ");
        ref = head;
        while(ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
