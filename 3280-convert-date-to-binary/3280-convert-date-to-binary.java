class Solution {
     public String fun(int n){
        StringBuilder str=new StringBuilder();
         while(n>0){
            if(n%2==1){
                str.append("1");
            }
            else {
                str.append("0");
            }
            n/=2;
         }
        return str.reverse().toString();

     }
    public String convertDateToBinary(String s ) {
        int y=Integer.parseInt(s.substring(0,4));
          int m=Integer.parseInt(s.substring(5,7));
            int d=Integer.parseInt(s.substring(8,10));
            String x="";
            x+=fun(y)+"-"+fun(m)+"-"+fun(d);
            return x;
        
          
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna