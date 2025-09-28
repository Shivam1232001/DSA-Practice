public class ReverseString {
 
        public void reverseString(char[] s) {
            int n=s.length;
            int i=0;
            int j=n-1;
    
            while(i<=j){
               char temp=s[i];
               s[i]=s[j];
               s[j]=temp;
               i++;
               j--;
            }
        }

        public static void main(String[] args) {
            ReverseString obj=new ReverseString();
            char s[]={'h','e','l','l','o'};

            char res[]=new char[s.length];

            obj.reverseString(s);
            int i=0;

            for(char ch:s){
               res[i++]=ch;
            }

            for(int j=0;j<res.length;j++){
                System.out.print(res[j] + " ");
            }

        
        }
}

