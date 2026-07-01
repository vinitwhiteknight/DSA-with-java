class Solution {
    public int[] countBits(int num) {
        int[] f = new int[num + 1];
        for (int i=1; i<=num; i++) 
        
            f[i] = Integer.bitCount(i);
    
    return f;
    }
}
