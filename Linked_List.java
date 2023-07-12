import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class Linked_List {
    public static void print(Node head) {// print the entire Linked List
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node add_first(Node head, int data) {// Adds a element before the head and makes that element the new
                                                       // head
        Node newHead = new Node(data);
        newHead.next = head;
        return newHead;
    }

    public static Node add_last(Node head, int data) {// adds a element at the end of Linked List
        Node temp = new Node(data);

        if (head == null)
            return temp;
        Node store = head;
        while (head.next != null) {
            head = head.next;

        }
        head.next = temp;
        return store;
    }

    public static Node delete_first(Node head) {// deletes the head of the Linked List and returns the next element as
                                                // the head
        if (head == null)
            return null;
        return head.next;
    }

    public static Node delete_last(Node head) { // removes the last element of the Linked List
        if (head == null || head.next == null)
            return null;
        Node curr = head;
        while (head.next.next != null) {
            head = head.next;
        }
        head.next = null;
        return curr;
    }

    public static Node removeDuplicates(Node head) {
        if (head == null)
            return null;
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else
                curr = curr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        Node temp3 = new Node(30);
        Node temp4 = new Node(30);
        Node temp5 = new Node(40);
        Node temp6 = new Node(40);
        head.next = temp1;
        temp1.next = temp2;
        temp2.next = temp3;
        temp3.next = temp4;
        temp4.next = temp5;
        temp5.next = temp6;// 10 --> 20 --> 30 --> 30 --> 30 --> 40
        print(head);
        System.out.println("The updated Linke List is:");
        head = add_first(head, 0);
        print(head);
        System.out.println("The updated Linked List - element was added in the last ");
        add_last(head, 40);
        print(head);
        head = delete_first(head);
        head = delete_last(head);
        System.out.println("The updated Linked List - element was removed from the front and the back ");
        print(head);
        System.out.println("f");
        print(removeDuplicates(head));

    }
}
