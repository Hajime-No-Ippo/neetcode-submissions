class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        int ans = 0;
        int l = 1, r = 0;

        // Find the Largest
        for(int pile : piles) {
            r = Math.max(r, pile);
        }

        while(l <= r){
            int mid = l + (r - l) / 2;
            long hours = 0;

            for(int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if(hours <= h) {
                ans = mid;
                r = mid - 1;
            }else{
                l = mid + 1;
            }
        }


        return ans;
    }
}
