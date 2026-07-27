/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) { 
        int lo=0,hi=n;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            int result=guess(mid);
            if(result==0){
            return mid;
            }
            else if(result==1){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna