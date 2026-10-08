class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int maxWeight = 0;
        int totalWeight = 0;

        for (int weight : weights) {
            maxWeight = Math.max(maxWeight, weight);
            totalWeight += weight;
        }

        while(maxWeight <= totalWeight){

            int capacity = (maxWeight + totalWeight)/2;

            int currentWeight = 0;
            int day = 1;

            for(int weight : weights){

                if(currentWeight + weight <= capacity){
                    currentWeight += weight;
                }else{

                    day++;
                    currentWeight = weight;

                }

            }
            if(day <= days){
                totalWeight = capacity - 1;
            }else{
                maxWeight = capacity + 1;
            }

        }
        return maxWeight;
    }
}