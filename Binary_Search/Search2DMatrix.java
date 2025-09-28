package Binary_Search;

public class Search2DMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;        // number of rows
        int n = matrix[0].length;     // number of cols

        int left = 0, right = m * n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midVal = matrix[mid / n][mid % n]; // map 1D index to 2D

            if (midVal == target) {
                return true;
            } else if (midVal < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    // Driver code for testing
    public static void main(String[] args) {
        Search2DMatrix sol = new Search2DMatrix();

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
        };

        int target1 = 3;
        int target2 = 13;

        System.out.println("Search " + target1 + ": " + sol.searchMatrix(matrix, target1)); // true
        System.out.println("Search " + target2 + ": " + sol.searchMatrix(matrix, target2)); // false
    }
}

