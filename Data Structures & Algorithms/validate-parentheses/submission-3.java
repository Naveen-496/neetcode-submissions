class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> cMap = new HashMap<>();
        cMap.put('(', ')');
        cMap.put('{', '}');
        cMap.put('[', ']');
        for ( int i = 0; i < s.length(); i++) {
            if (isOpenBracket(s.charAt(i))) {
               stack.push(cMap.get(s.charAt(i)));
            } else {
                if (stack.isEmpty() || stack.pop() != s.charAt(i)) {
                return false;
               }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }
}
