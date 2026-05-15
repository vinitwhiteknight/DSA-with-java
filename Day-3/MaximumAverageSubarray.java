class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n=nums.length;

        for( int i=0; i<k; i++){
            sum+=nums[i];

        }
        int maxSum=sum;
        int startindex=0;
        int endindex=k;

        while(endindex<nums.length){
            sum-=nums[startindex];
            startindex++;

            sum+=nums[endindex];
            endindex++;

            maxSum=Math.max(maxSum, sum);


        }
        return (double) maxSum/k;
    }
}
