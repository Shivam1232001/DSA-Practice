package Sliding_Window;

public class PermutationInString {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
 
         int[] s1Count = new int[26];
         int[] s2Count = new int[26];
 
         // Build initial window counts
         for (int i = 0; i < s1.length(); i++) {
             s1Count[s1.charAt(i) - 'a']++;
             s2Count[s2.charAt(i) - 'a']++;
         }
 
         // Check initial window
         if (matches(s1Count, s2Count)) return true;
 
         // Slide the window
         for (int r = s1.length(); r < s2.length(); r++) {
             int addIndex = s2.charAt(r) - 'a';             // add new char
             int removeIndex = s2.charAt(r - s1.length()) - 'a'; // remove old char
 
             s2Count[addIndex]++;
             s2Count[removeIndex]--;
 
             if (matches(s1Count, s2Count)) return true;
         }
 
         return false;
     }
 
      private boolean matches(int[] a, int[] b) {
         for (int i = 0; i < 26; i++) {
             if (a[i] != b[i]) return false;
         }
         return true;
     }

     public static void main(String[] args) {
        PermutationInString solution = new PermutationInString();

        String s1 = "ab";
        String s2 = "eidbaooo";
        System.out.println("Input: s1 = \"" + s1 + "\", s2 = \"" + s2 + "\"");
        System.out.println("Output: " + solution.checkInclusion(s1, s2)); // true

        s1 = "ab";
        s2 = "eidboaoo";
        System.out.println("Input: s1 = \"" + s1 + "\", s2 = \"" + s2 + "\"");
        System.out.println("Output: " + solution.checkInclusion(s1, s2)); // false

        s1 = "abc";
        s2 = "bbbca";
        System.out.println("Input: s1 = \"" + s1 + "\", s2 = \"" + s2 + "\"");
        System.out.println("Output: " + solution.checkInclusion(s1, s2)); // true
    }


}
