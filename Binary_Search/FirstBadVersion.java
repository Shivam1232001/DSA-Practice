package Binary_Search;

// Mock base class for local testing
class VersionControl {
    private int firstBad;

    // constructor to set the first bad version
    public VersionControl(int firstBad) {
        this.firstBad = firstBad;
    }

    /**
     * API that returns true if version is bad
     */
    protected boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

// Solution class
public class FirstBadVersion extends VersionControl {
    public FirstBadVersion(int firstBad) {
        super(firstBad);
    }

    public int firstBadVersion(int n) {
        int l = 1, r = n;

        while (l < r) {
            int mid = l + (r - l) / 2;
            boolean res = isBadVersion(mid);

            if (res) {
                r = mid; // mid might be the first bad version
            } else {
                l = mid + 1; // mid is good, so first bad is on the right
            }
        }
        return l; // l == r, points to first bad version
    }

    // Driver method for local testing
    public static void main(String[] args) {
        int n = 10;          // total versions
        int firstBad = 7;    // first bad version

        FirstBadVersion sol = new FirstBadVersion(firstBad);
        int result = sol.firstBadVersion(n);

        System.out.println("First bad version was: " + firstBad);
        System.out.println("Algorithm detected: " + result);
    }
}

