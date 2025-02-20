// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV8AAAAAAABC61VCayPHysT_yPdrj7AEQ?e=PvzGUF
// https://leetcode.com/problems/middle-of-the-linked-list/

public class MiddleLL {
    public ListNode middleNode(ListNode head) {
        int len = findLength(head);
        len = len / 2;
        ListNode temp = head;
        while(len > 0) {
            temp = temp.next;
            len--;
        }

        return temp;
    }

    int findLength(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp != null) {
            temp = temp.next;
            len++;
        }

        return len;
    }
}
