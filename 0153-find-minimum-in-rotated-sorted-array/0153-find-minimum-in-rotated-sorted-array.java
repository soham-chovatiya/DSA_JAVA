class Solution {
    public int findMin(int[] nums) {

        int minValue = Integer.MAX_VALUE;

        for(int i = 0; i < nums.length; i++){
            if(minValue > nums[i]){
                minValue = nums[i];
            }
        }
        return minValue;
    }
}