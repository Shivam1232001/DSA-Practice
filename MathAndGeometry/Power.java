package MathAndGeometry;

public class Power {
    public double myPow(double x, int n) {
        //-------O(n)-----------
        // double ans=1;
        // int pow=n;
        // if(n==0)return 1;
        //  if(pow<0){
        //     pow=-pow;
        //     x=1/x;
        // }
        // while(pow>0){
        //             ans=ans*x;
        //             pow--;
        //     }
        //   return ans; 
        // }
    
        //---------log(n)----------
            double ans=1;
            if(n==0)return 1;
            long pow=n;
            if(n==0)return 1;
            if(pow<0){
                pow=-pow;
                x=1/x;
            }
    
            while(pow>0){
                if(pow%2==1){
                    ans=ans*x;
                }
                x=x*x;
                pow=pow/2;
            }
            return ans;
    }

    public static void main(String[] args) {
        Power obj=new Power();
        double x=0.00001;
        int pow=2147483647;
        double x2=745;
        int pow2=-75;

        double ans=obj.myPow(x, pow);
        double ans2=obj.myPow(x2, pow2);
        System.out.println(ans);
        System.out.println(ans2);
    }
}
