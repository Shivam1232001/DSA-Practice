import java.util.HashSet;
import java.util.Set;

public class Longest_Consecutive_Sequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer>ans=new HashSet<>();
        for(int num:nums){
            ans.add(num);
        }
        int longest=0;

        for(int num:ans){
            if(!ans.contains(num-1)){
                int length=1;
                while(ans.contains(num+length)){
                    length++;
                }
                 longest=Math.max(length,longest);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        Longest_Consecutive_Sequence obj =new Longest_Consecutive_Sequence();
        int nums[] = {100,4,200,1,3,2};
       int res= obj.longestConsecutive(nums);
       System.out.println(res);
       
    }
}
