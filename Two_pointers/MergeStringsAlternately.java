public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int i=0;int j=0;
        int m=word1.length();
        int n=word2.length();
        int flag=0;
        while(i<m && j<n){
            if(flag==0){
                ans.append(word1.charAt(i));
                i++;
                flag=1;
            }
            else{
                 ans.append(word2.charAt(j));
                j++;
                flag=0;
            }
        }

        while(i<m){
            ans.append(word1.charAt(i));
                i++;
        }
        while(j<n){
            ans.append(word2.charAt(j));
                j++;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately obj =new MergeStringsAlternately();
        String word1 = "abc";
        String word2="pqrs";
        String ans=obj.mergeAlternately(word1, word2);
        System.out.println(ans);
    }
}
