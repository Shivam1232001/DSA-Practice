//Range_Sum_Query_2D

class NumMatrix {
    private int[][] prefix;

    // Constructor: build the prefix sum matrix
    public NumMatrix(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        prefix = new int[r+1][c+1]; // +1 for easier boundary handling

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                prefix[i][j] = matrix[i-1][j-1]
                             + prefix[i-1][j]
                             + prefix[i][j-1]
                             - prefix[i-1][j-1];
            }
        }
    }

    // Query: get sum of submatrix
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return prefix[row2+1][col2+1]
             - prefix[row1][col2+1]
             - prefix[row2+1][col1]
             + prefix[row1][col1];
    }
}

public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
            {3, 0, 1, 4, 2},
            {5, 6, 3, 2, 1},
            {1, 2, 0, 1, 5},
            {4, 1, 0, 1, 7},
            {1, 0, 3, 0, 5}
        };

        NumMatrix obj = new NumMatrix(matrix);

        // Test queries
        System.out.println(obj.sumRegion(2, 1, 4, 3)); // expected 8+7 = 15
        System.out.println(obj.sumRegion(1, 1, 2, 2)); // expected 11
        System.out.println(obj.sumRegion(1, 2, 2, 4)); // expected 12
        System.out.println(obj.sumRegion(0, 0, 4, 4)); // expected total sum 58
    }
}
