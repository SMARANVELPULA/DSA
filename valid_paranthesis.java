class Solution {
    public boolean isValid(String s) {
        
        // while (s.contains("()") || s.contains("{}") || s.contains("[]") ){
        //     s = s.replace("()","");
        //     s = s.replace("{}","");
        //     s = s.replace("[]","");

        // }
        // return s.isEmpty();//
            Deque <Character> stack = new ArrayDeque<>();
            for(char c : s.toCharArray()){
                if (c == '(') stack.push (')');
                else if (c == '{') stack.push ('}');
                else if (c == '[') stack.push (']');
                else if(stack.isEmpty() || c!=stack.pop())return false;
            }
            return stack.isEmpty();

        
    }
}