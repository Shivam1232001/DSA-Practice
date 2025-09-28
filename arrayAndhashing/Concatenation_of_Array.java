//https://leetcode.com/problems/concatenation-of-array/description/

public class Concatenation_of_Array {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = ans[i + n] = nums[i];
            }
            return ans;
        }

        public static void main(String[] args) {
            Concatenation_of_Array sol = new Concatenation_of_Array();
            int[] nums = {1, 2, 3};
            int[] result = sol.getConcatenation(nums);
    
            // Print result
            System.out.print("Concatenated Array: ");
            for (int val : result) {
                System.out.print(val + " ");
            }
    
        }
}
