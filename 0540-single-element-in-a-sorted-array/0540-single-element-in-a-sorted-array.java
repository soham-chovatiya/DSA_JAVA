import java.util.HashMap;

class Solution {
    public int singleNonDuplicate(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            if (value.getValue() == 1) {
                return value.getKey();
            }
        }
        return -1;
    }
}