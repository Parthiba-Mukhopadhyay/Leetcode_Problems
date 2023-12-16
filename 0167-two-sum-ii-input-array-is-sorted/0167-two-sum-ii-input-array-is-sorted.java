class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int index1=0, index2=numbers.length-1;
        int result[]=new int[2];
        int sum=numbers[index1]+numbers[index2];
        while(sum!=target)
        {
            sum=numbers[index1]+numbers[index2];
            if(sum>target)
                index2--;
            else if(sum<target)
                index1++;
        }
        return new int[] {index1+1, index2+1};
    }
}