class Solution {
    public boolean isValid(String s) {
        //empty stack
        Stack<Character> stack = new Stack<>();
        //for loop to iterate from string
        for(char c : s.toCharArray()){

            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
            } else {

                if(stack.isEmpty()){
                    return false;
                }
                //otherwise get the top
                char top = stack.peek();
                if((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')){
                    stack.pop();
                } else {
                    return false;
                }
             }
        }
        return stack.isEmpty();
    }
}