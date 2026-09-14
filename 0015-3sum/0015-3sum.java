import java.util.ArrayList;

import java.util.Collections;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        int n = nums.length;

        Arrays.sort(nums);

        for(int i = 0; i < n; i++){

            if(i > 0 && nums[i] == nums[i -1]){
                continue;
            }

            int left = i + 1, right = n - 1;

            while(left < right){

                int sum = nums[left] + nums[right] + nums[i];

                if(sum == 0){

                    List<Integer> list2 = Arrays.asList(nums[left], nums[right], nums[i]);

                    Collections.sort(list2);
                    list.add(list2);

                    left++;
                    right--;

                    while(left < right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }

                }else if(sum < 0){
                    left++;
                }else{
                    right--;
                }

            }
        }
        return list;
    }
}