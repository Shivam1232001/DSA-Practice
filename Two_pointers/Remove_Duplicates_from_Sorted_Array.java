public class Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] arr) {
        int n=arr.length;
        int cnt=0;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                cnt++;
                arr[cnt]=arr[i];
            }
        }
        return cnt+1;
    }

    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,5,5,6};
        Remove_Duplicates_from_Sorted_Array obj =new Remove_Duplicates_from_Sorted_Array();
        int res=obj.removeDuplicates(numbers);
        System.out.println(res);
    }
}
