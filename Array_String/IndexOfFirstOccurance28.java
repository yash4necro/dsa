class IndexOfFirstOccurance28 {
    public int strStr(String haystack, String needle) {
        if (!haystack.contains(needle)) return -1;
        else return haystack.indexOf(needle);
    }
}