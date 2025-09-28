package Binary_Search;

public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int minval=Integer.MAX_VALUE;
        
       while (left <= right) {
        if (nums[left] <= nums[right]) {
            minval = Math.min(minval, nums[left]);
            break;
        }

        int mid = left + (right - left) / 2;
        minval = Math.min(minval, nums[mid]);

        if (nums[mid] >= nums[left]) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return minval;    
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray obj=new FindMinimumInRotatedSortedArray();
        int arr[]={3,4,5,1,2};
        int ans=obj.findMin(arr);
        System.out.println(ans);

    }
}
