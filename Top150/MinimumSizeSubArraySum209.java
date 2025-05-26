class MinimumSizeSubArraySum209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, minLength = Integer.MAX_VALUE, currentSum = nums[0];
        do {
            if (currentSum < target) {
                right++;
                if (right == nums.length) break;
                currentSum += nums[right];
            } else if (currentSum >= target) {
                minLength = right - left + 1 < minLength ? right - left + 1 : minLength;
                currentSum -= nums[left];
                left++;
            }
        } while (left <= right);
        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }
}