class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++){
            ans+=count(s,i,i);
            ans+=count(s,i,i+1);
        }
        return ans;
    }
    public int count(String s,int i,int j){
        int c=0;
        while(i>=0 && j<s.length()){
            if(s.charAt(i)==s.charAt(j)){
                c++;
                i--;
                j++;
            }else{
                break;
            }
        }
        return c;

    }
}

//approach-2
class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            // Case 1: Odd length palindromes (center is at a character)
            count += expand(s, i, i);
            // Case 2: Even length palindromes (center is between two characters)
            count += expand(s, i, i + 1);
        }
        return count;
    }

    private int expand(String s, int left, int right) {
        int count = 0;
        // Expand outwards as long as characters match and pointers are in bounds
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            count++;
            left--;
            right++;
        }
        return count;
    }
}
