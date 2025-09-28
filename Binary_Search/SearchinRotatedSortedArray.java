package Binary_Search;

public class SearchinRotatedSortedArray {
    public int search(int[] arr, int k) {
        int l=0;
        int r=arr.length-1;

        while(l<=r){
            int mid=l+(r-l)/2;

            if(arr[mid]==k){
                return mid;
            }
          if(arr[l]<=arr[mid]){
               if(k>=arr[l]&& k<arr[mid])
                    r=mid-1;
               else
                  l=mid+1;
           }
          else
              if(k>arr[mid]&&k<=arr[r])
                    l=mid+1;
              else
                    r=mid-1;  
       }
        return -1;
        }

        public static void main(String[] args) {
            SearchinRotatedSortedArray obj=new SearchinRotatedSortedArray();
            int arr[]={3,4,5,1,2};
            int ans=obj.search(arr,5);
            System.out.println(ans);
    
        }
}
