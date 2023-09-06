class Solution {
    
    public String sortString(String s)
    {
        char tarr[]=s.toCharArray();
        Arrays.sort(tarr);
        return new String(tarr);
    }
    
    public boolean isAnagram(String s, String t) 
    {
        String ns=sortString(s);
        String nt=sortString(t);
        if(ns.equals(nt))
            return true;
        return false;
    }
}