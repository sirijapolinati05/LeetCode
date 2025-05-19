class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= nums.length;    // k = k % nums.length;
        reverseNum(nums, 0, n - 1);
        reverseNum(nums, 0, k - 1);
        reverseNum(nums, k, n - 1);
    }

    public void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp; 
            start++;
            end--;
        }
    }
}
