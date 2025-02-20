// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNWAAAAAAAAB0M3lPSNdqbbSKwLYZYKKAg?e=S9ZWhy
// https://leetcode.com/problems/linked-list-cycle/description/

public class DetectCycle {
    // Method 1
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = head;
        while(temp != null) {
            if(set.contains(temp)) {
                return true;
            }

            set.add(temp);
            temp = temp.next;
        }

        return false;
    }


    // Method 2
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast) {
                return true;
            }
        }

        return false;
    }
}
