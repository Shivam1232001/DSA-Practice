package Sliding_Window;

import java.util.HashMap;

public class Longest_Repeating_Character_Replacement {
     public int characterReplacement(String s, int k) {
    HashMap<Character,Integer> count=new HashMap<>();
    int res=0;
    int l=0;
    int max=0;
    for(int r=0;r<s.length();r++){
        count.put(s.charAt(r),count.getOrDefault(s.charAt(r),0)+1);
        max=Math.max(max,count.get(s.charAt(r)));

        while((r-l+1)-max>k){
            count.put(s.charAt(l),count.get(s.charAt(l))-1);
            l++;
        }
        res=Math.max(res,r-l+1);
    }
    return res;
}
public static void main(String[] args) {
    Longest_Repeating_Character_Replacement obj=new Longest_Repeating_Character_Replacement();
    String s="abcdabcd";
    int k=2;
   int res= obj.characterReplacement(s,k);
   System.out.println(res);

}
}
