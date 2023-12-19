class Solution {
    public int reverse(int x) {
        int ans=0;
        int val=x;
        if(x<0)
            val=0-val;
        while(val>0)
        {
            int d=val%10;
            if(ans>Integer.MAX_VALUE/10||ans<Integer.MIN_VALUE/10)
                return 0;
            ans=(ans*10)+d;
            val=val/10;
        }
        return x<0?(0-ans):ans;
    }
}