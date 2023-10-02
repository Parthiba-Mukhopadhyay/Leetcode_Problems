class Solution {
    public int search(int[] nums, int target) {
        int f=0, l=nums.length-1;
        int mid;
        while(f<=l)
        {
            mid=(f+l)/2;
            if(nums[mid]==target)
                return mid;
            else if(target>nums[mid])
                f=mid+1;
            else if(target<nums[mid])
                l=mid-1;
        }
        return -1;
    }
}