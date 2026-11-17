import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();

        int pointer1 = 0;
        int pointer2 = 0;

        while(pointer1 < nums1.length && pointer2 < nums2.length){

            if(nums1[pointer1] < nums2[pointer2]){

                list.add(nums1[pointer1]);
                pointer1++;

            }else{

                list.add(nums2[pointer2]);
                pointer2++; 

            }
            
        }

        while(pointer1 < nums1.length){
            
            list.add(nums1[pointer1]);
            pointer1++;

        }

        while(pointer2 < nums2.length){

            list.add(nums2[pointer2]);
            pointer2++;

        }

        int n = list.size();   // after merging

        double median;

        if (n % 2 == 0) {
            median = (list.get(n / 2 - 1) + list.get(n / 2)) / 2.0;
        } else {
            median = list.get(n / 2);
        }

        return median;

    }
}