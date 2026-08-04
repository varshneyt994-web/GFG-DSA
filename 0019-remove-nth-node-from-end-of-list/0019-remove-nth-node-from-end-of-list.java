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
    public ListNode removeNthFromEnd(ListNode head, int n) { 
         
        //  ListNode temp=head;
        //  int len=0;
        //  while(temp!=null){
        //     temp=temp.next;
        //     len++;
        //  }
        //   if(len==n) return head.next;
        //    temp=head;
        //    for(int i=1;i<=len-n-1;i++){
        //     temp=temp.next;
        //    }
        //     temp.next=temp.next.next;
        //     return head;
               

               // to pointer se
            ListNode slow=head;
             ListNode fast=head;

             for(int i=1;i<=n;i++){
                fast=fast.next;
             }
              if(fast==null){
                return head.next;
              }
               while(fast.next!=null){
                slow=slow.next;
                fast=fast.next;
               }
                slow.next=slow.next.next;
                return head;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna