class Solution {
    public int maxProfit(int[] prices) {
        int val=Integer.MAX_VALUE, po=0, pft=0;
        for(int i=0;i<prices.length;i++)
        {
            if(prices[i]<val)
                val=prices[i];
            pft=prices[i]-val;
            if(pft>po)
                po=pft;
        }
        return po;
    }
}