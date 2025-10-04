// MountainArray interface (as given in LeetCode)
package Binary_Search;

interface MountainArray {
    public int get(int index);
    public int length();
}

// Implementation of MountainArray for testing
class MountainArrayImpl implements MountainArray {
    private int[] arr;

    public MountainArrayImpl(int[] arr) {
        this.arr = arr;
    }

    @Override
    public int get(int index) {
        return arr[index];
    }

    @Override
    public int length() {
        return arr.length;
    }
}

// Solution class
class MountainArrayFind {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int length = mountainArr.length();

        // Find Peak
        int l = 1, r = length - 2, peak = 0;
        while (l <= r) {
            int m = (l + r) / 2;
            int left = mountainArr.get(m - 1);
            int mid = mountainArr.get(m);
            int right = mountainArr.get(m + 1);
            if (left < mid && mid < right) {
                l = m + 1;
            } else if (left > mid && mid > right) {
                r = m - 1;
            } else {
                peak = m;
                break;
            }
        }

        // Search left portion (increasing part)
        l = 0;
        r = peak;
        while (l <= r) {
            int m = (l + r) / 2;
            int val = mountainArr.get(m);
            if (val < target) {
                l = m + 1;
            } else if (val > target) {
                r = m - 1;
            } else {
                return m;
            }
        }

        // Search right portion (decreasing part)
        l = peak;
        r = length - 1;
        while (l <= r) {
            int m = (l + r) / 2;
            int val = mountainArr.get(m);
            if (val > target) {
                l = m + 1;
            } else if (val < target) {
                r = m - 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}

// Main class to test
public class Main {
    public static void main(String[] args) {
        // Example mountain array: strictly increasing then strictly decreasing
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        MountainArray mountainArr = new MountainArrayImpl(arr);

       MountainArrayFind sol = new MountainArrayFind();
        int target = 6;

        int result = sol.findInMountainArray(target, mountainArr);
        System.out.println("Index of " + target + " is: " + result);
    }
}
