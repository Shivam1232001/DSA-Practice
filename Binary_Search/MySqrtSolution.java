package Binary_Search;

public class MySqrtSolution {

    // Function to compute integer square root using binary search
    public int mySqrt(int x) {
        if (x == 0) return 0; // edge case

        int l = 1;
        int r = x;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (mid <= x / mid) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r; // r is the integer square root
    }

    // Driver code
    public static void main(String[] args) {
        MySqrtSolution sol = new MySqrtSolution();

        int x1 = 8;
        int x2 = 9;
        int x3 = 1;
        int x4 = 0;

        System.out.println("mySqrt(" + x1 + ") = " + sol.mySqrt(x1)); // Expected 2
        System.out.println("mySqrt(" + x2 + ") = " + sol.mySqrt(x2)); // Expected 3
        System.out.println("mySqrt(" + x3 + ") = " + sol.mySqrt(x3)); // Expected 1
        System.out.println("mySqrt(" + x3 + ") = " + sol.mySqrt(x4));
    }
}
        
