// Link to problem: https://leetcode.com/problems/intersection-of-two-arrays/description/
import java.util.*;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i: nums1){
            set1.add(i);
        }
        for(int i: nums2){
            set2.add(i);
        }
        if(set1.size() > set2.size()){
        for(int i : set1){
            if(set2.contains(i)) list.add(i);
        }
        }
        else {
            for(int i : set2){
            if(set1.contains(i)) list.add(i);
        }
        }
        int[] arr = new int[list.size()];
        int j = 0;
            for(int i : list){
                arr[j++] = i;
            }
        
        return arr;
    
    }
}
