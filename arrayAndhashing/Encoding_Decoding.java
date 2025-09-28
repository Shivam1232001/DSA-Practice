import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Encoding_Decoding {
    public String encode(List<String> strs){
        StringBuilder sb=new StringBuilder();

        for(String s: strs){
            sb.append(s.length()).append(s).append("#");
        }
        return sb.toString();
}

    public List<String> decode(String str){
        List<String> res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;
            while(j<str.length() && Character.isDigit(str.charAt(j))){
                j++;
            }
            int length=Integer.parseInt(str.substring(i,j));

            String word=str.substring(j,j+length);
            res.add(word);

            i=j+length+1;
        }
        return res;
    }

    public static void main(String[] args) {
        Encoding_Decoding sol = new Encoding_Decoding();
        List<String> input = Arrays.asList("leet", "code");

        String encoded = sol.encode(input);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = sol.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
