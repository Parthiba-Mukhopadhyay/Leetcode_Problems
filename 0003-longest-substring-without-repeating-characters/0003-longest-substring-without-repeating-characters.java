class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0)
            return 0;
        int max=Integer.MIN_VALUE;
        Set<Character> set= new HashSet<>();
        int index1=0;
        for(int index2=0;index2<s.length();index2++)
        {
            if(set.contains(s.charAt(index2)))
            {
                while(index1<index2 && set.contains(s.charAt(index2)))
                {
                    set.remove(s.charAt(index1));
                    index1++;
                }
            }
            set.add(s.charAt(index2));
            max = Math.max(index2-index1+1,max);
        }
        return max;
    }
}