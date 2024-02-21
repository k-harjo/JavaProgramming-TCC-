package p19_3;

public class SortedMatrixSearch {


    public static int[] searchInSortedMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int i = 0; 
        int j = cols - 1; 

        while (i < rows && j >= 0) {
            if (matrix[i][j] == target) {
                return new int[]{i, j}; 
            } else if (matrix[i][j] > target) {
                j--; 
            } else {
                i++;
            }
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        int target = 29;
        int[] result = searchInSortedMatrix(matrix, target);
        if (result[0] != -1) {
            System.out.println("Element found at: (" + result[0] + ", " + result[1] + ")");
        } else {
            System.out.println("Element not found.");
        }
    }
}
