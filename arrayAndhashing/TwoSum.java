//https://leetcode.com/problems/two-sum/description/

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        HashMap<Integer, Integer> prev = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prev.containsKey(diff)) {
                return new int[]{prev.get(diff), i};
            }
            prev.put(num, i);
        }
        return new int[]{}; // return empty array if no solution
    }

    // int n=nums.length;
        // int ans[]=new int [2];
        // ans[0]=-1;
        // ans[1]=-1;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             ans[0]=i;
        //             ans[1]=j;
        //             return ans;
        //         }
        //     }
        // }
        // return ans;

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + Arrays.toString(result));
        } else {
            System.out.println("No solution found.");
        }
    }
}

