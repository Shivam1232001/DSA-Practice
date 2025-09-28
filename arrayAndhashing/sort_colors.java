//https://leetcode.com/problems/sort-colors/

public class sort_colors {
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public void sortColors2(int[] nums) {
        int l = 0, i = 0, r = nums.length - 1;
 
     while (i <= r) {
         if (nums[i] == 0) {
             swap(nums, i, l);
             l++;
             i++;
         } else if (nums[i] == 2) {
             swap(nums, i, r);
             r--;
         } else {
             i++;
         }
        }
     }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int cnt0=0;
        int cnt1=0;
        int cnt2=0;

        for(int i=0;i<n;i++){
            if(nums[i]==0){
                cnt0++;
            }
            else if (nums[i]==1){
                cnt1++;
            }
            else cnt2++;
        }

        for(int i=0;i<n;i++){
            if(cnt0>0){
                nums[i]=0;
                cnt0--;
            }
            else if(cnt1>0){
                nums[i]=1;
                cnt1--;
            }
            else {
                nums[i]=2;
                cnt2--;
            }
        }  
    }

    public static void main(String[] args) {
        sort_colors obj=new sort_colors();

        int nums[]={1,2,0,0,1,2,2,1,1,2};

        obj.sortColors(nums);
    }
    
}
