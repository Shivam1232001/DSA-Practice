//https://leetcode.com/problems/group-anagrams/description/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> ans=new HashMap<>();

        if(strs==null || strs.length==0)return new ArrayList<>();

        for(int i=0;i<strs.length;i++){
            char s[]=strs[i].toCharArray();
            Arrays.sort(s);

            String key=new String(s);

            ans.putIfAbsent(key,new ArrayList<>());

            ans.get(key).add(strs[i]);
        }
        return new ArrayList<>(ans.values());

    }

    public static void main(String[] args) {
        Group_Anagrams obj=new Group_Anagrams();

        String strs[]=  {"eat","tea","tan","ate","nat","bat"};

        List<List<String>> ans =new ArrayList<>();

        ans=obj.groupAnagrams(strs);
        System.out.println(ans);

    }
}
