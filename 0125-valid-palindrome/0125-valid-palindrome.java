class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            if(!Character.isLetter(s.charAt(i)) && !Character.isDigit(s.charAt(i)))
                i++;
            else if(!Character.isLetter(s.charAt(j)) && !Character.isDigit(s.charAt(j)))
                j--;
            else{
                if(s.charAt(i)!=s.charAt(j)){
                    System.out.println(i+" "+j);
                    return false;
                }
                else
                {
                    i++;
                    j--;
                }
                    
            }

        }
        return true;
    }
}