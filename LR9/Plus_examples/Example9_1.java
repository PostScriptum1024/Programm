package Plus_examples;

import node.Node;

public class Example9_1 {
    public static void main(String[] args) {

        //Список с головы до хвоста соответственно
        Node node0 = new Node(0, null);
        Node node1 = new Node(1, null);
        Node node2 = new Node(2, null);
        Node node3 = new Node(3, null);

        node0.next = node1;//
        node1.next = node2;//Связка узлов ссылками в единый список
        node2.next = node3;//

        //Вывод списка
        Node ref = node0;
        while (ref != null) {
            System.out.println(" " + ref.value);
            ref = ref.next;
        }
    }
}
