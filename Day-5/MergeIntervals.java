class Solution {
    public int[][] merge(int[][] intervals) {
        int max = 0, min = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] interval : intervals) {
            int start = interval[0], end = interval[1];
            map.put(start, Math.max(end, map.getOrDefault(start, end)));
            max = Math.max(max, end);
            min = Math.min(min, start);
        }

        List<int[]> result = new ArrayList<>();
        int start = min, end = min;
        boolean isLookingForEnd = false;
        for (int i = min; i <= max; i++) {
            if (!isLookingForEnd) {
                if (map.containsKey(i)) {
                    start = i;
                    end = map.get(i);
                    if (start == end) {
                        result.add(new int[]{start, end});
                        continue;
                    }
                    isLookingForEnd = true;
                }
            } else {
                if (map.containsKey(i)) {
                    end = Math.max(end, map.get(i));
                }
                if (i == end) {
                    result.add(new int[]{start, i});
                    isLookingForEnd = false;
                }
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
