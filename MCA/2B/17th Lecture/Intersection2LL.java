// OneNote Link:- https://1drv.ms/o/c/d5ef4fad675c6c2f/Ei9sXGetT-8ggNV-AAAAAAABXKp-eYako79rQn-jfq6gsw?e=5cVa6I

public class Intersection2LL {
    // Method 1
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> listA = storeInList(headA);
        ArrayList<ListNode> listB = storeInList(headB);
        ListNode ans = null;
        int indexA = listA.size()-1;
        int indexB = listB.size()-1;
        while(indexA >= 0 && indexB >= 0) {
            if(listA.get(indexA) == listB.get(indexB)) {
                ans = listA.get(indexA); // listB.get(indexB)
                indexA--;
                indexB--;
            } else {
                break;
            }
        }

        return ans;
    }

    // Method 2
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> listA = storeInList(headA);
        ArrayList<ListNode> listB = storeInList(headB);
        for(int i=0; i<listA.size(); i++) {
            ListNode curr = listA.get(i);
            for(int j=0;j<listB.size();j++) {
                if(curr == listB.get(j)) {
                    return curr;
                }
            }
        }

        return null;
    }

    ArrayList<ListNode> storeInList(ListNode head) {
        ArrayList<ListNode> list = new ArrayList<>();
        ListNode temp = head;
        while(temp != null) {
            list.add(temp);
            temp =temp.next;
        }

        return list;
    }
}
