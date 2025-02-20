// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I

// https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleLL {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
    }
}
