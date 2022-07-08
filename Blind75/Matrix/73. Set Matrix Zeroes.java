/**
Given an m * n integer matrix matrix, if an element is 0, set its entire row and column to 0's.

Constraints:
m == matrix.length
n == matrix[0].length
1 <= m, n <= 200
-231 <= matrix[i][j] <= 231 - 1
 
Follow up:
A straightforward solution using O(mn) space is probably a bad idea.
A simple improvement uses O(m + n) space, but still not the best solution.
Could you devise a constant space solution?
*/

public void setZeroes(int[][] matrix) {
    int m = matrix.length, n = matrix[0].length, k = 0;
    // First row has zero?
    while (k < n && matrix[0][k] != 0) ++k;
    // Use first row/column as marker, scan the matrix
    for (int i = 1; i < m; ++i)
        for (int j = 0; j < n; ++j)
            if (matrix[i][j] == 0)
                matrix[0][j] = matrix[i][0] = 0;
    // Set the zeros
    for (int i = 1; i < m; ++i)
        for (int j = n - 1; j >= 0; --j)
            if (matrix[0][j] == 0 || matrix[i][0] == 0)
                matrix[i][j] = 0;
    // Set the zeros for the first row
    if (k < n) Arrays.fill(matrix[0], 0);
}
