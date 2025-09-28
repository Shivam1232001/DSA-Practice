import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
         Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int n=nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            for(int j=i+1;j<n;j++){
                if (j > i+1 && nums[j] == nums[j - 1]) continue;
            

            int l = j + 1;
            int r = n - 1;

            while (l < r) {
                long sum = nums[i] + nums[j]+ 0L + nums[l] + nums[r];
                if (sum > target) {
                    r--;
                } else if (sum < target) {
                    l++;
                } else {
                    ans.add(Arrays.asList(nums[i],nums[j], nums[l], nums[r]));
                    l++;
                    r--;
                    // skip duplicates for l
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                     while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }
                }
            }
        }
        }
        return ans;
    }

    public static void main(String[] args) {
        FourSum solver = new FourSum();

        int[] numbers = {-1,0,-1,0,-2,2};
        int target=0;
        List<List<Integer>> ans = solver.fourSum(numbers,target);

        System.out.println("Result: " + ans);
    }
}
