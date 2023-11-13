class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int sum=0, index1=0, index2=numbers.length-1;
        while(index1<index2)
        {
            sum=numbers[index1]+numbers[index2];
            if(sum==target)
            {
                int arr[]={index1+1,index2+1};
                return arr;
            }
            else if(sum<target)
            {
                index1++;
            }
            else if(sum>target)
            {
                index2--;
            }
        }
        int arr[]={-1,-1};
        return arr;
    }
}