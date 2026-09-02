class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        int N = bloomDay.length;

        int minDays = Integer.MAX_VALUE;
        int maxDays = Integer.MIN_VALUE; 

        if((long) m*k > N){
            return -1;
        }

        for(int days : bloomDay){
            minDays = Math.min(minDays, days);
            maxDays = Math.max(maxDays, days);  
        }

        int low = minDays;
        int high = maxDays;

        int answer = 0;

       while(low <= high){

            int day = (low + high) / 2;

            int bauquets = 0;
            int consecutive = 0;

            for(int i = 0; i < N; i++){

                if(bloomDay[i] <= day){
                    consecutive++;

                    if(consecutive == k){
                        bauquets++;
                        consecutive = 0;
                    }
                }else{
                    consecutive = 0;
                }

            }
            if(bauquets >= m){
                answer = day;
                high = day - 1;
            }else{
                low = day + 1;
            }
        }
        return answer;
    }
}