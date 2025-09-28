public class Valid_Palindrome {
    public boolean isPalindrome(String s) {
        int start=0;
        int end=s.length()-1;

        if (s.isEmpty()) {
        	return true;
        }
        
        while(start<=end){
            char currfirst=s.charAt(start);
            char currlast=s.charAt(end);

            if(!Character.isLetterOrDigit(currfirst)){
                start++;
            }
            else if(!Character.isLetterOrDigit(currlast)){
                end--;
            }
            else{
                if(Character.toLowerCase(currfirst)!=Character.toLowerCase(currlast)){
                    return false;
                }

                start++;
                end--;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Valid_Palindrome obj =new Valid_Palindrome();

        String s = "A man, a plan, a canal: Panama";

        boolean result=obj.isPalindrome(s);
        System.out.println(result);
    }
}
