class Solution {
    public boolean canPlace(int[] position, int m, int distance){

        int ball = 1;
        int lastPosition = position[0];

        for(int i = 1; i < position.length; i++){

            if(position[i] - lastPosition >= distance){

                    ball++;
                    lastPosition = position[i];

            }
        }
        if(ball >= m){
            return true;
        }

        return false;

    }

    public int maxDistance(int[] position, int m) {

        Arrays.sort(position);

        int low = 0, high = position[position.length - 1] - position[0];

        int ans = 0;

        while(low <= high){

            int mid = (low + high)/2;

            if(canPlace(position, m, mid)){

                ans = mid;
                low = mid + 1;

            }else{

                high = mid - 1;

            }
        }
        return ans;
    }
}