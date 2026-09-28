/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> l = new PriorityQueue<>((a,b) -> (a.val-b.val));
        for(int i=0;i<lists.length;i++){
            if(lists[i]!=null){
                l.add(lists[i]);
            }
        }

        ListNode dummy = new ListNode();
        ListNode ans = dummy;
        while(!l.isEmpty()){
            ListNode curr = l.poll();
            dummy.next = curr;
            dummy = dummy.next;
            if(curr.next!=null){
                l.add(curr.next);
            }
        }
        return ans.next;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna