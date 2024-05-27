package Plus_examples;

import node.Node;

public class Example9_5 {

    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }
        System.out.println("Исхоный список: ");
        Node ref = head;
        while(ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }

        Node newNode = new Node(79, null);
        ref = head;
        int count = 1; // счетчик элементов
        while (ref.next != null && count < 5) {
            ref = ref.next;
            count++;
        }

        newNode.next = ref.next;

        ref.next = newNode;

        System.out.println("Итоговый список: ");
        ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
