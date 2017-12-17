package scrap;

/**
 * Created by kjangade on 12/7/2017.
 */

class Node {
    int data;
    Node next;

    Node(int i) {
        this.data = i;
        this.next = null;
    }
}

class LinkedList {
    public Node add(int data, Node node) {
        if (node == null) {
            return new Node(data);
        } else {
            node.next = add(data, node.next);
        }
        return node;
    }

    /*private Node createNode(int i) {
        Node node = new Node();

        node.data = i;
        node.next = null;

        return node;
    }*/

    public void printList(Node node) {
        if (node == null) {
            System.out.println("null");
            return;
        }

        System.out.print(node.data + "->");
        printList(node.next);
    }

    public Node addNumber(Node node1, Node node2) {
        Node result = null;
        Node temp = null;
        Node prev = null;
        int sum, carry = 0;

        while (node1 != null || node2 != null) {
            sum = carry + (node1 != null ? node1.data : 0) + (node2 != null ? node2.data : 0);

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            temp = new Node(sum);

            if (result == null) {
                result = temp;
            } else
                prev.next = temp;

            prev = temp;

            if (node1 != null)
                node1 = node1.next;
            if (node2 != null)
                node2 = node2.next;

        }

        if (carry > 0)
            temp.next = new Node(carry);

        return result;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        Node node1 = null;
        LinkedList list = new LinkedList();

        node1 = list.add(1, node1);
        node1 = list.add(9, node1);
        node1 = list.add(4, node1);


        Node node2 = null;
        node2 = list.add(3, node2);
        node2 = list.add(4, node2);
        node2 = list.add(2, node2);


        Node result = list.addNumber(node1, node2);

        list.printList(node1);
        list.printList(node2);
        list.printList(result);


    }
}
