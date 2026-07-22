/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {

    public boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    boolean isMirror(Node r1, Node r2) {

        if (r1 == null && r2 == null) {
            return true;
        }

        if (r1 == null || r2 == null) {
            return false;
        }

        if (r1.data != r2.data) {
            return false;
        }

        return isMirror(r1.left, r2.right) &&
               isMirror(r1.right, r2.left);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna