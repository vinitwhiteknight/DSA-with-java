class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int p : piles){
            right = Math.max(right,p);
        }

        while(left <= right){
            int mid = left+(right-left)/2;
            long totalHours = 0;
            for(int p : piles){
                totalHours += (p+mid-1)/mid;
            }
            if(totalHours <= h){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return left;
    }
}
