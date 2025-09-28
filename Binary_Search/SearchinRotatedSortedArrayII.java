package Binary_Search;

public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] == target) {
                return true;
            }

            if (nums[l] == nums[mid] && nums[r] == nums[mid]) {
                l++;
                r--;
            }
            else if (nums[l] <= nums[mid]) { // Left half sorted
                if (nums[l] <= target && nums[mid] > target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            else { // Right half sorted
                if (nums[r] >= target && nums[mid] < target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
        }
        return false;
    }

    // Main method for testing
    public static void main(String[] args) {
        SearchinRotatedSortedArrayII sol = new SearchinRotatedSortedArrayII();

        int[] nums1 = {2,5,6,0,0,1,2};
        int target1 = 0;
        System.out.println("Search 0 in [2,5,6,0,0,1,2] → " + sol.search(nums1, target1));

        int[] nums2 = {2,5,6,0,0,1,2};
        int target2 = 3;
        System.out.println("Search 3 in [2,5,6,0,0,1,2] → " + sol.search(nums2, target2));

        int[] nums3 = {1,0,1,1,1};
        int target3 = 0;
        System.out.println("Search 0 in [1,0,1,1,1] → " + sol.search(nums3, target3));

        int[] nums4 = {1,1,1,3,1};
        int target4 = 3;
        System.out.println("Search 3 in [1,1,1,3,1] → " + sol.search(nums4, target4));
    }
}

