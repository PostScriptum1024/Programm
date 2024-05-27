package Independent_examples;

import node.Node;

public class Example9_5_Tail {
    public static void main(String[] args) {
        Node head = null;
        for (int i = 19; i >= 0; i--)
            head = new Node(i, head);

        Node ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}
