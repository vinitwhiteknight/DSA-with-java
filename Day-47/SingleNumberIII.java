class Solution {
    public int[] singleNumber(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Build the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find the elements that appear only once
        int[] result = new int[2];
        int index = 0;
     
