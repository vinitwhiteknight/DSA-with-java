class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length; 
        int arr[] = new int[n];
        int k = arr.length-1; 
        int i = 0; int j = n-1; 
        while(i<=j){
            int last = nums[j] * nums[j];
            int first = nums[i] * nums[i];
            
            if(last>first){
                arr[k] = last; 
                j--;
            }
            else{
                arr[k] = first; 
                i++;
            }
            k--;
        }
        return arr; 
        
    }
}
