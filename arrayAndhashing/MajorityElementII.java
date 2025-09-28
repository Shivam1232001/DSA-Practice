import java.util.*;

public class MajorityElementII {

    // ---------------- Brute Force ----------------
    public static List<Integer> majorityElementBruteForce(int[] nums) {
        int n = nums.length;
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]) {
                    cnt++;
                }
            }
            if (cnt > n / 3 && !res.contains(nums[i])) {
                res.add(nums[i]);
            }
        }
        return res;
    }

    //HahMap Approach

    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        Map<Integer,Integer> freq=new HashMap<>();
        List<Integer>res=new ArrayList<>();
 
        for(int num:nums){
         freq.put(num,freq.getOrDefault(num,0)+1);
        }
 
        for(Map.Entry<Integer,Integer> entry : freq.entrySet()){
         if(entry.getValue()>n/3){
             res.add(entry.getKey());
         }
        }
        return res;
     }

    // ---------------- Boyer-Moore ----------------
    public static List<Integer> majorityElementBoyerMoore(int[] nums) {
        int n = nums.length;
        Integer cand1 = null, cand2 = null;
        int count1 = 0, count2 = 0;

        // Step 1: Find candidates
        for (int num : nums) {
            if (cand1 != null && num == cand1) {
                count1++;
            } else if (cand2 != null && num == cand2) {
                count2++;
            } else if (count1 == 0) {
                cand1 = num;
                count1 = 1;
            } else if (count2 == 0) {
                cand2 = num;
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        // Step 2: Verify candidates
        count1 = count2 = 0;
        for (int num : nums) {
            if (cand1 != null && num == cand1) count1++;
            else if (cand2 != null && num == cand2) count2++;
        }

        List<Integer> res = new ArrayList<>();
        if (count1 > n / 3) res.add(cand1);
        if (count2 > n / 3) res.add(cand2);

        return res;
    }

    // ---------------- Main ----------------
    public static void main(String[] args) {
        int[] nums = {3, 2, 3, 2, 2, 1, 1};

        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Brute Force Result: " + majorityElementBruteForce(nums));
        System.out.println("Boyer-Moore Result: " + majorityElementBoyerMoore(nums));
    }
}

