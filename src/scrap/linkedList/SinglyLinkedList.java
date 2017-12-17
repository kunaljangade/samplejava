package scrap.linkedList;

/**
 * Created by kjangade on 7/28/2017.
 */

class Node {
    int i;
    Node next;
}

class LinkedList {

    public Node insertAtPosition(int i, int position, Node node) {

        if (position < 1) {
            System.out.println("Position cannot be less than 1");
            return node;
        }
        if (position > 1 && node == null) {
            System.out.println("Position cannot be greater than the number of elements in the list");
            return node;
        }
        if (position == 1 && node == null) {
            return getNewNode(i);
        }
        if (position == 1) {
            Node newNode = getNewNode(i);
            newNode.next = node;
            return newNode;
        }
        node.next = insertAtPosition(i, position - 1, node.next);
        return node;


        /*if (position < 1) {
            System.out.println("Position cannot be less then 1");
            return node;
        }
        if (node == null && position > 1) {
            System.out.println("Position cannot be greater than number of elements");
            return node;
        }
        if (node == null && position == 1) {
            return getNewNode(i);
        }
        if (position == 1) {
            Node newNode = new Node();
            newNode.next = node;
            return newNode;
        }

        node.next = insertAtPosition(i, position - 1, node.next);
        return node;*/
    }

    public Node insertHead(int i, Node node) {
        Node a = getNewNode(i);
        a.next = node;

        return a;
    }

    public void printList(Node node) {
        if (node == null) {
            System.out.print("null");
            return;
        }

        System.out.print(node.i + "->");
        printList(node.next);
    }

    private Node getNewNode(int i) {
        Node a = new Node();
        a.i = i;
        a.next = null;
        return a;
    }

    public Node insert(int i, Node node) {
        if (node == null)
            return getNewNode(i);
        else
            node.next = insert(i, node.next);
        return node;
    }

    public Node delete(Node node) {
        if (node == null || node.next == null) {
            return null;
        }

        Node temp = node;

        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return node;
    }

    public Node deleteHead(Node node) {
        if (node == null) {
            return null;
        }

        return node.next;
    }

    public Node deleteAtPosition(int position, Node node) {
        if (position < 1) {
            System.out.println("Not a valid position");
            return node;
        }
        if (node == null && position > 1) {
            System.out.println("Position is out of the node list");
            return node;
        }
        if (position == 1) {
            return node.next;
        }
        node.next = deleteAtPosition(position - 1, node.next);
        return node;
    }

    public int getLengthOfList(Node node) {
        if (node == null) {
            return 0;
        }
        return getLengthOfList(node.next) + 1;



        /*int leftCount = 1;
        if (node == null) {
            System.out.println(0);
            return 0;
        }

        Node tmp = node;
        while (tmp.next != null) {
            tmp = tmp.next;
            leftCount++;
        }
        return leftCount;*/
    }

    public boolean ifNodeExists(Node node, int val) {
        if (node == null) {
            return false;
        }
        while (node != null) {
            if (node.i == val)
                return true;
            node = node.next;
        }
        return false;
    }

    public Node rotateClockwise(Node node, int rotate) {
        if (node == null || rotate < 1) {
            return node;
        }

        int sizeOfLinkedList = getLengthOfList(node);
        rotate = rotate % sizeOfLinkedList;

        if (rotate == 0) {
            return node;
        }

        Node tmp = node;

        int i = 1;

        while (i < sizeOfLinkedList - rotate) {
            tmp = tmp.next;
            i++;
        }

        Node temp = tmp.next;
        Node head = temp;
        tmp.next = null;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;

        return head;
    }

    public Node rotateAntiClockwise(Node node, int k) {
        if (node == null || k < 1) {
            return node;
        }

        int sizeOfLinkedList = getLengthOfList(node);
        k = k % sizeOfLinkedList;

        if (k == 0) {
            return node;
        }

        Node tmp = node;

        int i = 1;

        while (i < k) {
            tmp = tmp.next;
            i++;
        }

        Node temp = tmp.next;
        Node head = temp;
        tmp.next = null;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        return head;
    }

    public Node reverse(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node temp = reverse(node.next);
        node.next.next = node;
        node.next = null;

        return temp;
    }

    public Node middleNode(Node node) {
        if (node == null) {
            return null;
        }

        Node a = node;
        Node b = node.next;

        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
        }
        return a;
    }

    public Node mergeSort(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node middle = middleNode(node);
        Node secondHalf = middle.next;
        middle.next = null;

        return merge(mergeSort(node), mergeSort(secondHalf));
    }

    public Node merge(Node a, Node b) {
        Node temp = new Node();
        Node finalList = temp;

        while (a != null && b != null) {
            if (a.i < b.i) {
                temp.next = a;
                a = a.next;
            } else {
                temp.next = b;
                b = b.next;
            }
            temp = temp.next;
        }
        temp.next = (a == null) ? b : a;
        return finalList.next;
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        Node root = null;
        LinkedList list = new LinkedList();


        //root = list.insertAtPosition(4, 1, root);
//        root = list.insert(10, root);
        root = list.insert(33, root);
        root = list.insert(27, root);
        root = list.insert(9, root);
//        root = list.insert(53, root);
//        root = list.insert(61, root);

        list.printList(root);
        System.out.println();

        /*root = list.insertHead(8, root);
        list.printList(root);
        System.out.println();*/

        /*root = list.insertAtPosition(4, 3, root);
        list.printList(root);*/


        /*root = list.delete(root);
        list.printList(root);

        System.out.println();
        root = list.delete(root);
        list.printList(root);*/

        /*root = list.deleteHead(root);
        list.printList(root);*/

        /*root = list.deleteAtPosition(3, root);
        list.printList(root);*/

        /*int length = list.lengthOfList(root);
        System.out.println("Length of LinkedList: " + length);*/

        /*boolean ifExist = list.ifNodeExists(root, 10);
        System.out.println(ifExist);*/

        /*root = list.rotateClockwise(root, 2);
        list.printList(root);*/

        /*root = list.rotateAntiClockwise(root, 2);
        list.printList(root);*/

        root = list.reverse(root);
        list.printList(root);

        /*root = list.middleNode(root);
        System.out.println(root.i);
//        list.printList(root);*/

        /*Node sortedList = list.mergeSort(root);
        System.out.println("Sorted List:");
        list.printList(sortedList);*/
    }
}
