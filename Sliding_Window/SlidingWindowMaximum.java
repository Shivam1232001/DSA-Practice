package Sliding_Window;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static int[] maxSlidingWindow(int[] nums, int k) {
           int n=nums.length;
           int l=0;int r=0;
           int output[]=new int[n-k+1] ;
            Deque<Integer> q=new LinkedList<>();
    
           while(r<n){
            while(!q.isEmpty() && nums[q.getLast()]<nums[r]){
                q.removeLast();
            }
            q.addLast(r);
            if(l>q.getFirst()){
                q.removeFirst();
            }
            if ((r + 1) >= k) {
                    output[l] = nums[q.getFirst()];
                    l++;
                }
                r++;
           }
           return output;
        }
    
         public static void main(String[] args) {
            int[] nums = {1,3,-1,-3,5,3,6,7};
            int k = 3;
            System.out.println(Arrays.toString(maxSlidingWindow(nums, k)));
    }
}
