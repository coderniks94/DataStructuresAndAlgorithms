package src;

/**
 * Given a boolean matrix with values true/false
 * A player is at the top left end
 * He can move only right and down one step
 * Find no of ways he can reach the bottom right cell
 * He cannot go to cell marked as false
 */
public class CountPathsMatrix {
    public static void main(String[] args) {
        int totalRows = 5, totalCols = 5;
        Boolean[][] matrix = new Boolean[totalRows][totalCols];

        //set values
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                matrix[i][j] = true;
            }
            System.out.println();
        }

        matrix[1][1] = false;
        matrix[2][4] = false;
        matrix[3][1] = false;
        matrix[4][3] = false;
        //print all
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //System.out.println("Total rows: " + matrix.length + "\nTotal Cols: " + matrix[0].length);
        System.out.println("No of paths: " + countPaths(matrix));
    }

    private static int countPaths(Boolean[][] matrix) {
        int[][] result = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                result[i][j] = -1;
            }
        }
        return countPaths(matrix, 0, 0, result);
    }

    private static int countPaths(Boolean[][] matrix, int row, int col, int[][] result) {
        if (row == matrix.length - 1 && col == matrix[0].length - 1) return 1;
        if (row >= matrix.length || col >= matrix[0].length || matrix[row][col] == false) return 0;
        if (result[row][col] != -1) return result[row][col];
        result[row][col] = countPaths(matrix, row + 1, col, result) + countPaths(matrix, row, col + 1, result);
        return result[row][col];
    }

}
