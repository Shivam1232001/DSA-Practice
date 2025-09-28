public class Longest_Common_Prefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length ==0 && strs==null)return "";

        String prefix=strs[0];

        for (int i=1;i<strs.length;i++){

            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);

                if(prefix.length()==0)return "";
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        Longest_Common_Prefix obj =new Longest_Common_Prefix();

        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix:" + obj.longestCommonPrefix(strs1) );

        String[] strs2 = {"dog", "dont", "done"};
        System.out.println("Longest common prefix:" + obj.longestCommonPrefix(strs2) );
    }
}
