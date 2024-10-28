class IsSubsequence392 {
    public boolean isSubsequence(String s, String t) {
        char [] sChar = s.toCharArray();
        for (int i = 0; i < sChar.length; i++) {
            if (!t.contains(sChar[i]+"")) return false;
            else t = t.substring(t.indexOf(sChar[i]) + 1);
        }
        return true;
    }
}