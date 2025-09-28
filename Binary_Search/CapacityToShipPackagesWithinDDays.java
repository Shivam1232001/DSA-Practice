package Binary_Search;

public class CapacityToShipPackagesWithinDDays {
    public int shipWithinDays(int[] weights, int days) {
        int maxwght=Integer.MIN_VALUE;
        int sum=0;

        for(int wgh:weights){
           maxwght=Math.max(maxwght,wgh); 
           sum+=wgh;
        }

        int l=maxwght;
        int r=sum;

        while(l<=r){
            int mid=l+(r-l)/2;
            if(canShip(weights,mid,days)){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;
    }

    public boolean canShip(int weights[],int mid,int days){
        int sum=0;
        int day=1;
        for(int wgh:weights){
            if(sum+wgh > mid){
                sum=0;
                day++;
            }
            sum+=wgh;
            if(day>days){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        CapacityToShipPackagesWithinDDays sol = new CapacityToShipPackagesWithinDDays();
        int[] weights1 = {1,2,3,4,5,6,7,8,9,10};
        int days1 = 5;
        System.out.println("Min capacity: " + sol.shipWithinDays(weights1, days1)); // Expected 15

        int[] weights2 = {3,2,2,4,1,4};
        int days2 = 3;
        System.out.println("Min capacity: " + sol.shipWithinDays(weights2, days2)); // Expected 6

        int[] weights3 = {1,2,3,1,1};
        int days3 = 4;
        System.out.println("Min capacity: " + sol.shipWithinDays(weights3, days3)); // Expected 3
    }
}
