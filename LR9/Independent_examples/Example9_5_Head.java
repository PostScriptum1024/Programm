package Independent_examples;

import node.Node;

public class Example9_5_Head {
    public static void main(String[] args) {
        int value = 0;
        Node head = new Node(value, null);
        Node ref = head;
        while (value != 9) {
            value++;
            ref.next = new Node(value, null);
            ref = ref.next;
        }
        ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
