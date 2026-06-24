class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n = s.length();
        int maxLen = 0;
        Set<String> words = new HashSet<>(wordDict.size());

        for(String word : wordDict){
            maxLen = Math.max(maxLen,word.length());
            words.add(word);
        }

        BitSet dp = new BitSet(n);

        for(int i = 0; i < n; i++){
            String curr = "";
            for(int j = i; j >= Math.max(0,i - maxLen + 1); j--){
                curr = s.charAt(j) + curr;

                if(words.contains(curr) && (j - 1 < 0 || dp.get(j - 1))){
                    dp.set(i);
                    break;
                }
            }
        }

        return dp.get(n-1);
    }
}
