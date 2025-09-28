import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) break; // since array is sorted, no need to continue
            if (i > 0 && nums[i] == nums[i - 1]) continue; // skip duplicates

            int l = i + 1;
            int r = nums.length - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum > 0) {
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    // skip duplicates for l
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ThreeSum solver = new ThreeSum();

        int[] numbers = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> ans = solver.threeSum(numbers);

        System.out.println("Result: " + ans);
    }
}
