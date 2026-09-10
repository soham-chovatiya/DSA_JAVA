class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for(int weight : weights){

            low = Math.max(weight, low);
            high += weight;

        }

        while(low <= high){
            
            int capacity = (low + high) / 2;

            if(isShiping(weights, days, capacity)){
                high = capacity - 1;
            }else{
                low = capacity + 1;
            }

        }

        return low;
    }

    public boolean isShiping(int[] weights, int days, int capacity){

        int currentWeight = 0;
        int requiredDays = 1;

        for(int weight : weights){

            if(currentWeight + weight <= capacity){
                currentWeight += weight;
            }else{
                requiredDays++;
                currentWeight = weight;
            }

        }

        return requiredDays <= days;

    }
}