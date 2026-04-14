class Solution {
    public boolean isAnagram(String s, String t) {
       if (!isLengthSame(s, t)) {
            return false;
        }
        
        Map<Character, Integer> charMap = new HashMap<>();
        for ( int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        
        for ( int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if (!charMap.containsKey(c)) {
                return false;
            }
            
            charMap.put(c, charMap.get(c) - 1);
            
            if (charMap.get(c) < 0 ) {
                return false;
            }
            
        }
        return true;
    }

    
    private boolean isLengthSame(String s, String t) {
        return s.length() == t.length();
    }
}
