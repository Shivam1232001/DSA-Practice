//https://leetcode.com/problems/valid-anagram/description/

public class Valid_Anagram {

        public static boolean isAnagram(String s, String t) {
            int n1 = s.length();
            int n2 = t.length();
            if (n1 != n2) return false;
    
            int temp[] = new int[26]; // frequency array
    
            for (int i = 0; i < n1; i++) {
                temp[s.charAt(i) - 'a']++;
                temp[t.charAt(i) - 'a']--;
            }
    
            for (int i = 0; i < 26; i++) {
                if (temp[i] != 0) return false;
            }
            return true;
        }
    
        public static void main(String[] args) {
            String s1 = "listen";
            String s2 = "silent";
    
            if (isAnagram(s1, s2)) {
                System.out.println(s1 + " and " + s2 + " are anagrams.");
            } else {
                System.out.println(s1 + " and " + s2 + " are NOT anagrams.");
            }
        }
    }
    

