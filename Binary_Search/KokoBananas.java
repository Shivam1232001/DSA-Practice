package Binary_Search;

public class KokoBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int lo = 1;
        int max = 0;
        for (int p : piles) {
            max = Math.max(max, p);
        }
        int hi = max;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;

            if (canEat(piles, mid, h)) {
                hi = mid; 
                lo = mid + 1; 
            }
        }
        return lo; 
    }

    public boolean canEat(int[] piles, int k, int h) {
        int hours = 0;
        for (int p : piles) {
            hours += p / k;
            if (p % k != 0) {
                hours++;
            }
            if (hours > h) return false; // early stop
        }
        return true;
    }

    // test
    public static void main(String[] args) {
        KokoBananas sol = new KokoBananas();

        int[] piles1 = {3, 6, 7, 11};
        System.out.println(sol.minEatingSpeed(piles1, 8)); // Expected 4

        int[] piles2 = {30, 11, 23, 4, 20};
        System.out.println(sol.minEatingSpeed(piles2, 5)); // Expected 30

        int[] piles3 = {30, 11, 23, 4, 20};
        System.out.println(sol.minEatingSpeed(piles3, 6)); // Expected 23
    }
}

