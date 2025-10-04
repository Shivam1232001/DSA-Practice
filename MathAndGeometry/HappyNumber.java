package MathAndGeometry;

public class HappyNumber {
    public boolean isHappy(int n) {
        int slow=n;int fast=sumofsquare(n);

        while(slow!=fast){
            
            fast=sumofsquare(fast);
            fast=sumofsquare(fast);
            slow=sumofsquare(slow);
        }

        return fast==1;
    }

    public int sumofsquare(int n){
        int sq=0;
        while(n!=0){
            sq+=(n%10)*(n%10);
            n/=10;
        }
        return sq;
    }

    public static void main(String[] args) {
        HappyNumber obj=new HappyNumber();
        int num=255;
        int num2=19;
        boolean res1=obj.isHappy(num);
        boolean res2=obj.isHappy(num2);
        System.out.println("Res1="+res1+" "+"Res2="+res2);
    }
}
