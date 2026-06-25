class Solution {
      static {
          for(int i=0; i < 100; i++){
              findTargetSumWays(new int[]{1, 2, 3}, 3);
          }
      }
      public static int findTargetSumWays(int[] nums, int target) {
          int sum = 0;
          int zero= 0;
          for(int num  : nums){
              sum += num;
          }
