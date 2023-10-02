class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<Character>();
        char top;
        for (char c : s.toCharArray())
        {
            //char c=s.charAt(i);
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

        