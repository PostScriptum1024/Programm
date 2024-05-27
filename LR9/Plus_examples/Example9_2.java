package Plus_examples;

import node.Node;

public class Example9_2 {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 9; i >= 0; i --) {
            head = new Node(i, head);
        }

        Node ref2 = head;
        while(ref2 != null) {
            System.out.println(" " + ref2.value);
            ref2 = ref2.next;
        }
    }
}
