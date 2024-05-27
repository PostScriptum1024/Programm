package Plus_examples;

import node.Node;

public class Example9_7 {

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

        ref = head;

        while(ref.next.next != null)
            ref = ref.next;

        ref.next = null;

        System.out.println("Новый список: ");
        ref = head;
        while(ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
