class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int c=1, j=0;
        int max=1;
        if(nums.length==0)
            return 0;
        else{
            int temp[]=new int[nums.length];
            for(int i=0;i<nums.length-1;i++)
            {
                if(nums[i+1]==nums[i])
                    continue;
                temp[j++]=nums[i];
            }
            temp[j++]=nums[nums.length-1];
            
        for(int i=0;i<temp.length-1;i++)
        {
            if(temp[i+1]==(temp[i]+1))
            {
                c++;
            
            if(c>max)
            {
                max=c;
            }
            }
            else
                c=1;
            
        }
        return max;
    }
    }
}