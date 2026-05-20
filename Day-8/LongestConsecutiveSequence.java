class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet();
        for(int n: nums)
        {
            set.add(n);
        }

        int max = 0;
        for(Integer n: set)
        {
            if(set.contains(n-1))
            {
                continue;
            }

            int count = 1;
            while(set.contains(n+1))
            {
                count++;
                n = n+1;
            }

            max = Math.max(max, count);
        }

        return max;
    }
}
