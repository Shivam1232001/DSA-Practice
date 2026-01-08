import java.util.Arrays;

public class Boats_to_Save_People {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);

        int left = 0;
        int right = people.length - 1;
        int boats = 0;

        while (left <= right) {

            if (people[left] + people[right] <= limit) {
                left++;   
            }
            right--;      
            boats++;      
        }

        return boats;
    }

    public static void main(String[] args) {
        Boats_to_Save_People obj=new Boats_to_Save_People();
        int people[]={1,2,6,5,7,8,4};
       int res= obj.numRescueBoats(people, 8);
       System.out.println(res);
    }
}
