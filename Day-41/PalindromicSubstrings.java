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

