class Solution {
    public int findKthPositive(int[] arr, int k) {
        
        int n = arr.length;
        int count = 0;
        int range = n + k;

        for(int i = 1; i <= range; i++){

            boolean found = false;

            for(int j = 0; j < n; j++){

                if(arr[j] == i){
                    
                    found = true;
                    break;

                }
 
            }
            if(!found){

                count++;

                if(count == k){

                    return i;

                }
            }

        }
    return -1;
    }
}