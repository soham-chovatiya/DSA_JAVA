import java.util.Arrays;

class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        

        int n = nums.length;
        int count = 0;

        int minDivisor = 0;
        int max = 0;

        for(int maxNum : nums){
            max = Math.max(maxNum, max);
        }

        int low = 1, high = max;

        while(low <= high){

            int divisor = (low + high) / 2;
            int sum = 0;

            for(int i = 0; i < nums.length; i++){

                sum += (int)Math.ceil((double) nums[i] / divisor);

            }

            if(sum <= threshold){
                minDivisor = divisor;
                high = divisor - 1;
            }else{
                low = divisor + 1;
            }
        }
        return minDivisor;
    }
}