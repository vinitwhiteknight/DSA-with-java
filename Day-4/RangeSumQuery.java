class NumArray {
    private int[] presum;

    public NumArray(int[] nums) {
        int n=nums.length;
        presum=new int[n+1];
        presum[0]=0;

        for (int i=1; i<presum.length; i++){
            presum[i]= presum[i-1]+nums[i-1];

        }

    }
    
    public int sumRange(int left, int right) {
        return presum[right+1]-presum[left];
    }
}

