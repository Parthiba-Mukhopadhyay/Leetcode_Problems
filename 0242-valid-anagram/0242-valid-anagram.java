class Solution {
    
    public String sortString(String s)
    {
        char tarr[]=s.toCharArray();
        Arrays.sort(tarr);
        return new String(tarr);
    }
    
    public boolean isAnagram(String s, String t) 
    {
        if(sortString(s).equals(sortString(t)))
            return true;
        return false;
    }
}