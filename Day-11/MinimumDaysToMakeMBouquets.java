class Solution {
    public boolean isPossible(int[] arr, int day, int m, int k) {
        int cnt = 0;
        int noOfB = 0;

        for (int num : arr) {
            if (num <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }

        noOfB += cnt / k;

        return noOfB >= m;
    }

    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) return -1;

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int num : bloomDay) {
            low = Math.min(low, num);
            high = Math.max(high, num);
        }

        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isPossible(bloomDay, mid, m, k)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }
}
