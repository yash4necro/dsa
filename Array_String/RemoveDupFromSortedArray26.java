class RemoveDupFromSortedArray26 {
    public int removeDuplicates(int[] nums) {
        int uniques = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i+1]) {
                uniques++;
                nums[uniques] = nums[i+1];
            }
        }
        return uniques + 1;
    }
}