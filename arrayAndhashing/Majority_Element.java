public class Majority_Element {
    //BruteForce
    public int majorityElement(int[] nums) {
        int n=nums.length;
        
        for(int i=0;i<n;i++){
            int cnt=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                   cnt++;
                   if(cnt>(n/2))return nums[i];
                }
            }
        }
       return -1; 
    }

    //MooreVoting Algorithm

    public int majorityElement2(int[] nums) {
        int n=nums.length;

        int cnt=0;
        int ele=0;
        for(int i=0;i<n;i++){
            if(cnt==0){
                ele=nums[i];
                cnt=1;
            }
            else if(nums[i]==ele)cnt++;
            else cnt--;
        }
        return ele;
    }

    public static void main(String[] args) {

        Majority_Element obj =new Majority_Element();
        int nums[]={3,3,1,2,3,7,3};

        int result=obj.majorityElement(nums);
        System.out.println(result);

        int result2=obj.majorityElement2(nums);
        System.out.println(result2);
    }
}
