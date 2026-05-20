class Solution {
    public boolean isHappy(int n) {
        int x = 0;
        while(n>0){
            x += ((n%10)*(n%10));
            n = n/10;
        }
        if(x==1)
			return true;
		if(x==4)
			return false;

        return isHappy(x);

    }
}
