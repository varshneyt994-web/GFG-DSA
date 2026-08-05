/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
          if(head== null || head.next==null){
            return null;

        }
        ListNode slow = head;
        ListNode fast = head;
      while( fast!= null && fast.next!=null){
        slow= slow.next;
        fast= fast.next.next;

        if(fast== slow) break;
      }
       if(fast!=slow) return null;
      ListNode temp=head;
       while(temp!=slow){
        slow=slow.next;
        temp=temp.next;
       }
       return slow;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna