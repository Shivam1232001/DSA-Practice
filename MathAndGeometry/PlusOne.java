package MathAndGeometry;

import java.util.Arrays;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
       for(int i=n-1;i>=0;i--){
        if(digits[i]!=9){
            digits[i]++;
            return digits;
        }
        digits[i]=0;
       }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
    public static void main(String[] args) {
        PlusOne sol = new PlusOne();

        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(sol.plusOne(digits1))); // [1, 2, 4]

        int[] digits2 = {4, 3, 9};
        System.out.println(Arrays.toString(sol.plusOne(digits2))); // [4, 4, 0]

        int[] digits3 = {9, 9, 9};
        System.out.println(Arrays.toString(sol.plusOne(digits3))); // [1, 0, 0, 0]
    }
}
