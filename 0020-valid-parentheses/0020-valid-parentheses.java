class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        char top;
        for (int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='[' || c=='{' || c=='(')     
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                    return false;
                top=stack.peek();
                if((top=='[' && c==']') || (top=='{' && c=='}') || (top=='(' && c==')'))
                    stack.pop();
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }
}

        