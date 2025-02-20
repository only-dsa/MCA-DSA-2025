// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy

public class LinkedList {
    class Node {
        int data;
        Node next;

        Node(int val) {
            data = val;
        }
    }
    static Node head; // by default head = null
    static void insertAtLast(int val) {
        Node newNode = new Node(val);

        if(head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }

            // temp is at last
            temp.next = newNode;
        }
    }

    static void display() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    static void insertAtFront(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    static int findLength() {
        Node temp = head;
        int len = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }

        return len;
    }

    static void insertAtAnyPosition(int k, int val) {
        int len = findLength();
        if(k <= 0 || k > len + 1) {
            return;
        }
        if(k == 1) {
            insertAtFront(val);
        } else if(k == len + 1) {
            insertAtLast(val); // insertAtLast
        } else {
            k = k - 2;
            Node newNode = new Node(val);
            Node temp = head;
            while(k > 0) {
                temp = temp.next;
                k--;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }

    static void deleteAtFirst() {
        if(head == null) return;

        head = head.next;
    }

    static void deleteAtLast() {
        if(head == null || head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while(temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
    }

    static void deleteAtAnyPosition(int k) {
        int len = findLength();
        if(k <= 0 || k > len) {
            return;
        }
        if(k == 1) {
            deleteAtFirst();
        } else if(k == len) {
            deleteAtLast();
        } else {
            k = k - 2;
            Node temp = head;
            while(k > 0) {
                temp = temp.next;
                k--;
            }

            temp.next = temp.next.next;
        }
    }

    public static void main(String[] args) {
        insertAtLast(2);
        insertAtLast(5);
        insertAtLast(10);
        // insertAtFront(1);
        insertAtLast(200);
        // insertAtAnyPosition(1, 100);
        // insertAtAnyPosition(5, 100);
        insertAtLast(300);
        insertAtLast(400);
        // insertAtAnyPosition(5, 399);
        // deleteAtFirst();
        // deleteAtLast();
        // deleteAtAnyPosition(1); // first node delete
        // deleteAtAnyPosition(6); // last node delete
        // deleteAtAnyPosition(4); from any position
        display();
    }
}