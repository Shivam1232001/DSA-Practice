public class Product_of_Array_Except_Self {
    public int[] productExceptSelf(int[] nums) {

        //Brute Force(On^2)

        // int res[]=new int[nums.length];
        // for (int i=0;i<nums.length;i++){
        //     int ans=1;
        //     for(int j=0;j<nums.length;j++){
        //         if(i==j){
        //             continue;
        //         }
        //         ans=ans*nums[j];
        //     }
        //     res[i]=ans;
        // }
        // return res;

        //Optimized O(n)

        int n=nums.length;
        int res[]=new int[n];
        res[0]=1;
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1];
        }

        int suffixproduct=1;

        for(int i=n-1;i>=0;i--){
            res[i]*=suffixproduct;
            suffixproduct*=nums[i];

        }
        return res;
    }

    public static void main(String[] args) {
        Product_of_Array_Except_Self obj=new Product_of_Array_Except_Self();
        int nums[]={1,2,3,4,5,6};

        int res[]=obj.productExceptSelf(nums);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
}
