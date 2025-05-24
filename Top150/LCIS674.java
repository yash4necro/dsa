class LCIS674 {
    public int findLengthOfLCIS(int[] nums) {
        int current = 1, highest = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i+1]) current++;
            else {
                highest = current > highest ? current : highest;
                current = 1;
            }
        }
        return current > highest ? current : highest;
    }
}