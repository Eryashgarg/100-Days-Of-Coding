// Link to problem: https://leetcode.com/problems/median-of-two-sorted-arrays/description/
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0 , j = 0 , k = 0;
        int l1 = nums1.length , l2 = nums2.length;
        double temp[] = new double[l1+l2];
        while(j<l1 && k<l2){
            if(nums1[j]>nums2[k]){
                temp[i++]=nums2[k++];
            }
            else{
                temp[i++] = nums1[j++];
            }

        } 
        while(j<l1){
            temp[i++] = nums1[j++];
        }
        while(k<l2){
            temp[i++] = nums2[k++];
        }

        
        // if(l1==0){
        //     mid = l2;
        // }
        // if(l2==0){
        //     mid = l1;
        // }
        int mid = (l1+l2);
        
        if(mid%2==1){
            return temp[mid/2];
        }
        else{
            return ((temp[mid/2] + temp[mid/2 - 1])/2);
        }

    }
}
