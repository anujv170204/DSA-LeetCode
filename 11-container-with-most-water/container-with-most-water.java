class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        int maxArea = 0;

        int length = 0;
        int width = 0;

        while (left < right) {
            if (height[left] > height[right]) {
                length = height[right];
            } else {
                length = height[left];
            }
            width = right - left;
            area = length * width;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}
