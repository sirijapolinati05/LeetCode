class Solution {
    public int majorityElement(int[] nums) {
        int majority = nums[0], votes = 1;

        for (int i = 1; i < nums.length; i++) 
        {
            if (votes == 0) 
            {
                majority = nums[i];
                votes = 1;
            } 
            else if (majority == nums[i]) 
            {
                votes++;
            } 
            else 
            {
                votes--;
            }
        }
        return majority;
    }
}
