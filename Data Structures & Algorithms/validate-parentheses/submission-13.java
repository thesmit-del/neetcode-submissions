class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++) {
            Character m = s.charAt(i);

            if (m == '{' || m == '[' || m == '(') {
                stack.push(m);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                
                Character t = stack.pop();

                if (t == '{' && m != '}' || t == '[' && m != ']' || t == '(' && m != ')') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
