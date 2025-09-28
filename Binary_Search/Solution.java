package Binary_Search;

// Base class with the API (mocked for local testing)
class GuessGame {
    private int pick; // the hidden number

    // constructor to set the hidden number
    public GuessGame(int pick) {
        this.pick = pick;
    }

    /**
     * Compares guess with the hidden pick
     * @param num guessed number
     * @return -1 if pick < num
     *          1 if pick > num
     *          0 if pick == num
     */
    protected int guess(int num) {
        if (num == pick) return 0;
        return (num > pick) ? -1 : 1;
    }
}

// Solution class
public class Solution extends GuessGame {
    public Solution(int pick) {
        super(pick);
    }

    public int guessNumber(int n) {
        int l = 1, r = n;

        while (true) {
            int mid = l + (r - l) / 2;
            int res = guess(mid);

            if (res > 0) {
                l = mid + 1;
            } else if (res < 0) {
                r = mid - 1;
            } else {
                return mid;
            }
        }
    }

    // Driver method for local testing
    public static void main(String[] args) {
        int n = 100;      // upper bound
        int pick = 37;    // hidden number

        Solution game = new Solution(pick);
        int result = game.guessNumber(n);

        System.out.println("Hidden number was: " + pick);
        System.out.println("Guessed number is: " + result);
    }
}

