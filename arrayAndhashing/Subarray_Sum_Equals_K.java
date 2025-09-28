import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Equals_K {
    public int subarraySum(int[] nums, int k) {
        //  int res = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     int sum = 0;
        //     for (int j = i; j < nums.length; j++) {
        //         sum += nums[j];
        //         if (sum == k) res++;
        //     }
        // }
        // return res;

         int res = 0, curSum = 0;
        Map<Integer, Integer> prefixSums = new HashMap<>();
        prefixSums.put(0, 1);

        for (int num : nums) {
            curSum += num;
            int diff = curSum - k;
            res += prefixSums.getOrDefault(diff, 0);
            prefixSums.put(curSum, prefixSums.getOrDefault(curSum, 0) + 1);
        }

        return res;
    }

    public static void main(String[] args) {
        Subarray_Sum_Equals_K obj=new Subarray_Sum_Equals_K();
        int arr[]={1,1,1};
        int res=obj.subarraySum(arr, 2);
        System.out.println(res);

    }
        

}
