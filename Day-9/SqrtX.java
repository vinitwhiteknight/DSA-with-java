class Solution {
    public int mySqrt(int x) {
       int left=1;
       int right=x;
       if (x<2){
        return x;   
       }
       while(left<=right){
        int mid=left + (right-left)/2;
        long squ = (long) mid*mid;
        if(squ==x){
            return mid;
        }else if(squ<x){
            left=mid+1;
        }else{
            right=mid-1;
        }
       }
       return right;
    }
}
