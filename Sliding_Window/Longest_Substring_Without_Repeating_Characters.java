package Sliding_Window;

import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Characters {
    public int lengthOfLongestSubstring(String s) {
        //--------BruteForce----------

        // int max=0;
        // for(int i=0;i<s.length();i++){
        //      int cnt=0;
        //      Set<Character> seen= new HashSet<>();
        //     for (int j=i;j<s.length();j++){
        //         char c=s.charAt(j);
        //         if(seen.contains(c)){
        //             break;
        //         }
        //         seen.add(c);
        //        cnt++;
        //         max=Math.max(max,cnt);
        //     }
        // }
        // return max;

        //----------SlidingWindow----------

        int n=s.length();
        int left=0;
        Set<Character> seen= new HashSet<>();
        int max=0;
        
        for(int r=0;r<n;r++){
            while(seen.contains(s.charAt(r))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(r));
            max=Math.max(max,r-left+1);
            
        }
        return max;
    }

    public static void main(String[] args) {
        Longest_Substring_Without_Repeating_Characters obj=new Longest_Substring_Without_Repeating_Characters();
        String s="abcdabcd";
       int res= obj.lengthOfLongestSubstring(s);
       System.out.println(res);

    }
}
