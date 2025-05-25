class ContainerWithMostWater11 {
    public int maxArea(int[] height) {
        int currentArea = 0, maxArea = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while (left < right) {
            currentArea = (right - left) * (Math.min(height[left], height[right]));
            if (currentArea > maxArea) maxArea = currentArea;
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return maxArea;
    }
}