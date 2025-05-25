class TwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> targetMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (targetMap.containsKey(nums[i])) {
                return new int[]{targetMap.get(nums[i]), i};
            } else {
                targetMap.put(target - nums[i], i);
            }
        }
        return new int[2];
    }
}