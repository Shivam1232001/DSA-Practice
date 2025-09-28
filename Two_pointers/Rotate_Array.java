public class Rotate_Array {
    public void rotate(int[] nums, int k) {
    int n=nums.length;
    k=k%n;
    //-----uses extra space----

    // int ans[]=new int[n];
    // for(int i=n-k;i<n;i++){
    //     ans[j++]=nums[i];
    // }
    //  for(int i=0;i<n-k;i++){
    //     ans[j++]=nums[i];
    // }

    // for(int i=0;i<n;i++){
    //     nums[i]=ans[i];
    // }

    //---efficient way-----

    rotate2(nums,0,n-k-1);
    rotate2(nums,n-k,n-1);
    rotate2(nums,0,n-1);


}
public void rotate2(int[]nums,int i,int j){
    int n=nums.length;
    while(i<j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;

        i++;
        j--;
    }
}
public static void main(String[] args) {
    int[] numbers = {-1, 0, 1, 2, -1, -4};
    Rotate_Array obj=new Rotate_Array();
    obj.rotate(numbers, 2);
    for(int i=0;i<numbers.length;i++){
    System.out.println(numbers[i]);
    }
   
}
}
