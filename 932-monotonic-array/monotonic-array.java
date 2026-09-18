class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean as = true, de = true;
        for(int i=0; i<nums.length-1;i++){
            if (nums[i] < nums[i+1]) as = false;
            if (nums[i] > nums[i+1]) de = false; 
        }
        return as || de;
    }
}