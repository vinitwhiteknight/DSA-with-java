class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<Integer>();
        if(p.length() > s.length()) return  list; 
       
            int N=s.length(); 
            int M=p.length(); 
            int[]count = freq(p); 
            
            int[]currentCount = freq(s.substring(0, M)); 
            
            if(areSame(count,currentCount)) 
                list.add(0);
        
            int i;
            for(i=M;i<N;i++){ // going from 3 to 9 in above example
                currentCount[s.charAt(i-M) - 'a']--; // blue pointer, decrement frequency
                currentCount[s.charAt(i)-'a']++; // red pointer, increment frequency
                if(areSame(count,currentCount)){ // now check, both array are same
                    list.add(i-M+1); // if we find similar add their index in our list
                }
            }
        return list;
    }
    private boolean areSame(int[] x, int[] y){
        for(int i = 0; i < 26; i++){
            if(x[i] != y[i]) // compare all the frequency & doesnn't find any di-similar frequency return true otherwise false
                return false;
        }
        
        return true;
    }
  private int[] freq(String s){
        int[] count = new int[26]; // create array of size 26
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++; // update acc. to it's frequency
        }
        
        return count; // and return count 
    }
}
