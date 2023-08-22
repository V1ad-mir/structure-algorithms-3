package src.main;

public class LinkedList<T> {


    public Node head;


    public class Node {
        public Node next;
        public T value;

    }


    public void addFirst(T value) {
        Node node = new Node();
        node.value = value;
        if (head != null) {
            node.next = head;
        }
        head = node;
    }


    public void reversal() {
        if (head != null && head.next != null) {
            Node temp = head;
            reversal(head.next, head);
            temp.next = null;
        }
    }

    private void reversal(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            reversal(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('[');
        Node node = head;
        while (node != null) {
            stringBuilder.append(node.value);
            node = node.next;
            if (node != null)
                stringBuilder.append('\n');
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
