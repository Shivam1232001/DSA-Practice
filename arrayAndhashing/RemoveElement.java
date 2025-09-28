import java.util.Arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int k = 0; // pointer for valid elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move non-val element to position k
                k++;
            }
        }
        return k; // number of elements not equal to val
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = removeElement(nums, val);

        System.out.println("k = " + k);
        System.out.println("Modified array (first k elements): " + Arrays.toString(Arrays.copyOf(nums, k)));
    }
}
