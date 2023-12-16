class Solution {
    public int maxArea(int[] height) {
        int index1=0, index2=height.length-1;
        int max=0;
        while(index1<index2)
        {
            int area=(index2-index1)*Math.min(height[index1], height[index2]);
            max=Math.max(area,max);
            if(height[index1]<height[index2])
                index1++;
            else
                index2--;
        }
        return max;
    }
}