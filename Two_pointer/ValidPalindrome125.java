class Valid {
    public boolean isPalindrome(String s) {
        char ch[] = s.toLowerCase().toCharArray();
        int start = 0, end = ch.length - 1;
        while (start < end) {
            if (!isCharAlphanumeric(ch[start])) start++;
            if (!isCharAlphanumeric(ch[end])) end--;
            if (isCharAlphanumeric(ch[start]) && isCharAlphanumeric(ch[end])) {
                if(ch[start] != ch[end]) return false;
                else {
                    start++; end--;
                }
            }
        }
        return true;
    }
    public boolean isCharAlphanumeric (char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9')) return true;
        else return false; 
    }
}