package src.main;

public class LinkedList {

    Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            this.data = d;
            next = null;
        }

    }

    static LinkedList insert(LinkedList list, int data) {
        Node new_node = new Node(data);
        if(list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while(last.next!=null){
                last = last.next;
            }
            last.next = new_node;
        }

        return list;
    }

    static LinkedList reverse(LinkedList list){
            Node pointer = list.head;
            Node previous = null, current = null;

            while(pointer != null){
                current = pointer;
                pointer = pointer.next;

                current.next = previous;
                previous = current;
                list.head = current;
                }
                return list;
            }

    static void printList(LinkedList list) {
        while(list.head!=null){
            System.out.println(list.head.data);
            list.head = list.head.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = insert(list, 1);
        list = insert(list, 2);
        list = reverse(list);
        printList(list);
    }
}
