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
    public boolean isPalindrome(ListNode head) {
       ArrayList<Integer> arr = new ArrayList<>();
         while(head!=null){
            arr.add(head.val);
            head=head.next;
         }
            int lo=0;
            int hi=arr.size()-1;
             while(lo<hi){
                if (arr.get(lo)!=arr.get(hi)) {
                return false;
             }
             lo++;
             hi--;
            
         }
         return true;
        
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna