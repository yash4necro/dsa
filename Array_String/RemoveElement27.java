class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        int start = 0, end = nums.length - 1;
        if (nums.length == 1 && nums[start] == val) return 0;
        if (nums.length == 1 && nums[start] != val) return 1;
        while (start <= end) {
            if (nums[end] == val) {
                nums[end] = -1;
                end--;
            } else if (nums[start] == val) {
                nums[start] = nums[end];
                nums[end] = -1;
                start++; end--;
            } else if (nums[start] != val && nums[end] != val) {
                start++;
            }
        }
        return start;
    }
}