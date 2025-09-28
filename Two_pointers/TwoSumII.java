import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII {

    // Method to solve Two Sum II
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;

        while (l < r) {
            int currsum = numbers[l] + numbers[r];
            if (currsum < target) {
                l++;
            } else if (currsum > target) {
                r--;
            } else {
                return new int[]{l + 1, r + 1}; // 1-indexed result
            }
        }
        return new int[0]; // fallback


        //------MAP Method--------
        
        //  HashMap<Integer,Integer> mp=new HashMap<>();
        // for(int i=0;i<=r;i++){
        //     int comp=target-numbers[i];
        //     if(mp.containsKey(comp)){
        //         return new int[]{mp.get(comp),i+1};
        //     }
        //     mp.put(numbers[i],i+1);
        // }
        // return new int[0];
    }

    // Main method to test
    public static void main(String[] args) {
        TwoSumII solver = new TwoSumII();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = solver.twoSum(numbers, target);
        System.out.println("Result: " + Arrays.toString(result));
    }
}
