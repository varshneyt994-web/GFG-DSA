class Solution {
    public String concatHex36(int n) {
         StringBuilder str=new StringBuilder();
          int seq=n*n;
         while(seq>0){
             int rem=seq%16;
            if(rem>9){
                str.append((char)(rem-9+64));

            }
            else{
                str.append(rem);
            }
            seq/=16;
         }
         str.reverse();
         StringBuilder ptr=new StringBuilder();
          int cub=n*n*n;
         while(cub>0){
             int rem=cub%36;
            if(rem>9){
                ptr.append((char)(rem-9+64));

            }
            else{
                ptr.append(rem);
            }
            cub/=36;
         }
         ptr.reverse();
         return str.append(ptr).toString();
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna