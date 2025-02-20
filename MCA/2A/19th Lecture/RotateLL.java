// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV8AAAAAAABC61VCayPHysT_yPdrj7AEQ?e=PvzGUF
// https://leetcode.com/problems/rotate-list/

public class RotateLL {

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) {
            return head;
        }
        int len = findLength(head);
        k = k % len; 
        if(k == 0) {
            return head;
        }
        head = reverseList(head);

        k = k - 1;
        ListNode temp = head;
        while(k > 0) {
            temp = temp.next;
            k--;
        }
        System.out.println(head.val);

        ListNode newHead = temp.next;
        temp.next = null;
        // head ---> 5
        ListNode tail = head;
        head = reverseList(head); // new head --- last
        tail.next = reverseList(newHead); // new Head --- last wast

        return head;
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode temp = head;
        while(temp != null) {
            ListNode nextNode = temp.next;
            temp.next = prev;
            prev = temp;
            temp = nextNode;
        }


        return prev;
    }

    public int findLength(ListNode head) {
        int cnt = 0;
        ListNode temp = head;
        while(temp != null) {
            temp = temp.next;
            cnt++;
        }

        return cnt;
    }
}
