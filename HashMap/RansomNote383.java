class RansomNote383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map <Character, Integer> ranMap = new HashMap<Character, Integer>();
        char [] ranArr = ransomNote.toCharArray();
        char [] magArr = magazine.toCharArray();
        for (int i = 0; i < ranArr.length; i++) {
            if (ranMap.containsKey(ranArr[i])) ranMap.put(ranArr[i], ranMap.get(ranArr[i]) + 1);
            else ranMap.put(ranArr[i], 1);
        }
        for (int i = 0; i < magArr.length; i++) {
            if (ranMap.containsKey(magArr[i]) && ranMap.get(magArr[i]) > 0) ranMap.put(magArr[i], ranMap.get(magArr[i]) - 1);
            else continue;
        }
        for (Map.Entry <Character, Integer> rm: ranMap.entrySet()) {
            if (rm.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}