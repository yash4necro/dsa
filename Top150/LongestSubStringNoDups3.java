class LongestSubstringNoDups3 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;
        if (s.length() == 1) return 1;
        char ch[] = s.toCharArray();
        int left = 0, right = 1, maxLength = 1;
        String currentString = ch[left] + "";
        Set<Character> currentSet = new HashSet<Character>();
        currentSet.add(ch[left]);
        while (left <= right) {
            if (currentSet.contains(ch[right])) {
                currentSet.remove(ch[left]);
                left++;
                if (left == ch.length) break;
            } else {
                currentSet.add(ch[right]);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
                if (right == ch.length) break;
            }
        };
        return maxLength;
    }
}