class Solution {
    public int pivotIndex(int[] nums) {
        
        int n=nums.length;
        int[] sumleft =new int[n];
        int[] sumright=new int[n];
        sumleft[0]=nums[0];
        for(int i=1; i<n; i++){
            sumleft[i]=sumleft[i-1]+nums[i];
        }
        sumright[n-1]=nums[n-1];
         for (int i = n - 2; i >= 0; i--) {
            sumright[i] = sumright[i + 1] + nums[i];
        }

        for (int i = 0; i < n; i++) {
            int left = (i == 0) ? 0 : sumleft[i - 1];
            int right = (i == n - 1) ? 0 : sumright[i + 1];

            if (left == right) {
                return i;
            }
        }

        return -1;

    }
}
