import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Top_K_Frequent_Element {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> ans=new HashMap<>();
        for(int i =0;i<nums.length;i++){
            ans.put(nums[i],ans.getOrDefault(nums[i],0)+1);
        }

        List<int[]> arr = new ArrayList<>();

       List<Map.Entry<Integer, Integer>> entries = new ArrayList<>(ans.entrySet());

        for (int i = 0; i < entries.size(); i++) {
            Map.Entry<Integer, Integer> entry = entries.get(i);
            arr.add(new int[] { entry.getValue(), entry.getKey() });
        }

         arr.sort((a, b) -> b[0] - a[0]);

          int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = arr.get(i)[1]; 
        }
        return res;
    }


    public static void main(String[] args) {
        Top_K_Frequent_Element obj=new Top_K_Frequent_Element();
        int arr[] ={1,2,1,2,1,1,1,3,3,3,5,5,5,6,7};
        int ans[]=obj.topKFrequent(arr, 2);

        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
        

    }
}
