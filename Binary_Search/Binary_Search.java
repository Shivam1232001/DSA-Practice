package Binary_Search;

public class Binary_Search {
    public int search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
        

        while(l<=r){
            int mid=r+(l-r)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={-1,0,3,5,9,12};
        Binary_Search obj=new Binary_Search();
       int res=obj.search(arr, 3);
       System.out.println(res);
    }
}
