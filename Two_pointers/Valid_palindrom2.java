public class Valid_palindrom2 {
    public boolean isPalin(String s, int strt,int end){
        while(strt<end){
            if(s.charAt(strt)!= s.charAt(end))return false;
            strt++;
            end--;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        int cnt =0;
        int strt=0;
        int end=s.length()-1;

        while(strt<=end){
            if(s.charAt(strt)!= s.charAt(end)){
                cnt++;
                if(cnt>1){
                    return false;
                }

                return isPalin(s,strt+1,end) || isPalin(s,strt,end-1);
            }
            strt++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Valid_palindrom2 obj=new Valid_palindrom2();

        String s="aabbcdbbaa";
        String s2="aabcdbbaa";

        boolean res= obj.validPalindrome(s);
        boolean res2= obj.validPalindrome(s2);

        System.out.println(res);
        System.out.println(res2);
    }
}
