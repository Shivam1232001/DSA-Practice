//https://leetcode.com/problems/contains-duplicate/description/

import java.util.*;

public class Contains_Duplicate {
    
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> ans = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (ans.contains(nums[i])) {
                return true; // duplicate found
            }
            ans.add(nums[i]);
        }
        return false; // no duplicates
    }

    public static void main(String[] args) {
        Contains_Duplicate obj = new Contains_Duplicate();

        // Example test cases
        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {1, 2, 3, 1};

        System.out.println("nums1 contains duplicate? " + obj.containsDuplicate(nums1)); // false
        System.out.println("nums2 contains duplicate? " + obj.containsDuplicate(nums2)); // true
    }
}
