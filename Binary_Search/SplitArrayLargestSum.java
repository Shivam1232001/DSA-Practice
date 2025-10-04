package Binary_Search;

public class SplitArrayLargestSum {
    public int splitArray(int[] nums, int k) {
        int l=0; int r=0;
        for(int num:nums){
            l=Math.max(l,num);
            r+=num;
        }

        int res=l;
        while(l<=r){
            int mid=l+(r-l)/2;

            if(canSplit(nums,k,mid)){
                res=mid;
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return res;
    }

    public boolean canSplit(int[]nums,int k,int mid){
        int cursum=0;
        int subarray=1;
        for(int num:nums){
            cursum+=num;
            if(cursum>mid){
                subarray++;
                if(subarray>k){
                    return false;
                }
                cursum=num;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SplitArrayLargestSum obj=new SplitArrayLargestSum();
        int nums[]={7,2,5,10,8};
        int k=2;
        int ans=obj.splitArray(nums, k);
        System.out.println(ans);
    }
}
