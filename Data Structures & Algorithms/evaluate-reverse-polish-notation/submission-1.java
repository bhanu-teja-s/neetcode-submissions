class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(int c = 0; c < tokens.length; c++){
            String token = tokens[c];
            if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                if(token.equals("+")){
                    stack.push(a+b);
                }
                if(token.equals("-")){
                    stack.push(a-b);
                }
                if(token.equals("*")){
                    stack.push(a*b);
                }
                if(token.equals("/")){
                    stack.push(a/b);
                }
            }else{
                int n = Integer.parseInt(token);
                stack.push(n);
            }
        }
        return stack.pop();
    }
}