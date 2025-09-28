package Sliding_Window;

import java.util.ArrayList;
import java.util.List;

public class FindKClosestElements {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0;
        int r=arr.length-1;
        while(r-l>=k){
            if(Math.abs(x-arr[l])<=Math.abs(x-arr[r])){
                r--;
            }
            else{
                l++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=l;i<=r;i++){
            ans.add(arr[i]);
        }
        return ans;
    }
}
