import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int pointer1 = 0;
        int pointer2 = 0;

        int preEle = 0;
        int currentEle = 0;

        int n = nums1.length + nums2.length;

        for(int i = 0; i <= n/2; i++){

             preEle = currentEle;

            if(pointer1 < nums1.length && 
             (pointer2 >= nums2.length || 
             nums1[pointer1] <= nums2[pointer2])){

                currentEle = nums1[pointer1];
                pointer1++;

            }else{

                currentEle = nums2[pointer2];
                pointer2++;

            }

        }

        if (n % 2 == 0) {

            return (preEle + currentEle) / 2.0;

        } else {

            return currentEle;
        }


    }
}