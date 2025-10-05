package MathAndGeometry;

public class GreatestCommonDivisorofStrings {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1))return "";

        int gcdlen=gcd(str1.length(),str2.length());

        return str2.substring(0,gcdlen);

    }

    public int gcd(int a,int b){
        return b==0?a:gcd(b,a%b);
    }

    public static void main(String[] args) {
        GreatestCommonDivisorofStrings obj=new GreatestCommonDivisorofStrings();
        String str1="ABCABC";
        String str2="ABC";
        String res= obj.gcdOfStrings(str1, str2);
        System.out.println(res);
    }
}
