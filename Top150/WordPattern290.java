class Solution {
    public boolean wordPattern(String pattern, String s) {
        String [] sArr = s.split(" ");
        if (pattern.length() != sArr.length) return false;
        Map<Character, String> patternMap = new HashMap<Character, String>();
        Map<String, Character> sMap = new HashMap<String, Character>();
        for (int i = 0; i < pattern.length(); i++) {
            patternMap.putIfAbsent(pattern.charAt(i), sArr[i]);
            if (!patternMap.get(pattern.charAt(i)).equals(sArr[i])) return false;
            sMap.putIfAbsent(sArr[i], pattern.charAt(i));
            if (!sMap.get(sArr[i]).equals(pattern.charAt(i))) return false;

        }
        return true;
    }
}