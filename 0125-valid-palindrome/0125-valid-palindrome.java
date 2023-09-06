class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        String str="";
        for(i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i)))
                str=str+s.charAt(i);
        }
        i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}