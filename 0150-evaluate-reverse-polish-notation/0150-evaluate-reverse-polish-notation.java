class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        String symbol = "+-*/";
        for(String token: tokens) {
            if(token.length() == 1 && symbol.indexOf(token.charAt(0)) >= 0) {
                int a = stack.pop(), b = stack.pop(), c = 0;
                switch(token.charAt(0)){
                    case '+':
                    c = a + b;
                    break;
                    case '-':
                    c = b - a;
                    break;
                    case '*':
                    c = a * b;
                    break;
                    case '/':
                    c = b / a;
                }
                stack.push(c);
            }else stack.push(Integer.valueOf(token));
        }
        return stack.pop();
    }
}

