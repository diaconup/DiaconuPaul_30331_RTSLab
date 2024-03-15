public class Exercise2 {
    public static void main(String[] args) {
        int[][] matrix1 = { {2, 3, 1}, {7, 1, 6}, {9, 2, 4} };

        int[][] matrix2 = { {8, 5, 3}, {3, 9, 2}, {2, 7, 3} };

        System.out.println("Matrix1 is:");
        printMatrix(matrix1);

        System.out.println("Matrix2 is:");
        printMatrix(matrix2);

        int[][] sumMatrix = addMatrices(matrix1, matrix2);
        System.out.println("Sum of Matrices:");
        printMatrix(sumMatrix);

        int[][] productMatrix = multiplyMatrices(matrix1, matrix2);
        System.out.println("Product of Matrices:");
        printMatrix(productMatrix);
    }

    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
