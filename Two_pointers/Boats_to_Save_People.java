import java.util.Arrays;

public class Boats_to_Save_People {
    public int numRescueBoats(int[] people, int limit) {
        int l=0;
        int r=people.length-1;
        int res=0;
        Arrays.sort(people);
        while(l<=r){
            int remain=limit-people[r--];
            res++;
            if(l<=r && remain>=people[l]){
                l++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Boats_to_Save_People obj=new Boats_to_Save_People();
        int people[]={1,2,6,5,7,8,4};
       int res= obj.numRescueBoats(people, 8);
       System.out.println(res);
    }
}
