package Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {
     public boolean containsNearbyDuplicate(int[] nums, int k) {
        // int l=0;
        // Set<Integer> window=new HashSet<>();

        // for (int r=0;r<nums.length;r++){
           
        //     if(r-l>k){
        //         window.remove(nums[l]);
        //         l++;
        //     }
        //     if(window.contains(nums[r])){
        //         return true;
        //     }
        //      window.add(nums[r]);
        // }
        // return false;

        Map<Integer,Integer> ans=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(ans.containsKey(nums[i]) && i-ans.get(nums[i])<=k){
                return true;
            }
            ans.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Duplicate_II obj=new Contains_Duplicate_II();

        int nums[]={1,2,3,1};
        int k=3;
        boolean res=obj.containsNearbyDuplicate(nums,k);
        System.out.println(res);
    }
}
