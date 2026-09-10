class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        // Find search range
        for (int weight : weights) {
            low = Math.max(low, weight);
            high += weight;
        }

        // Binary Search
        while (low <= high) {

            int capacity = low + (high - low) / 2;

            if (canShip(weights, days, capacity)) {
                high = capacity - 1;
            } else {

                low = capacity + 1;
            }
        }

        return low;
    }

    private boolean canShip(int[] weights, int days, int capacity) {

        int currentWeight = 0;
        int requiredDays = 1;

        for (int weight : weights) {

            if (currentWeight + weight <= capacity) {
                currentWeight += weight;
            } else {
                requiredDays++;
                currentWeight = weight;
            }
        }

        return requiredDays <= days;
    }
}