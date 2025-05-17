class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int result[] = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) result[i] = nums[i];
            else if (nums[i] > 0) {
                int move = (i + nums[i])% nums.length;
                result[i] = nums[move];
            } else {
                int move = i - ((-1)*nums[i])%nums.length;
                result[i] = move >= 0 ? nums[move] : nums[nums.length+move];
            }
        }
        return result;
    }
}