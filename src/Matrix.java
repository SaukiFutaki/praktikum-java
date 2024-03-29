public class Matrix {
  public static void main(String[] args) {
    int[][] matrix1 = { { 1, 2 }, { 3, 4 } };
    int[][] matrix2 = { { 5, 6 }, { 7, 8 } };

    int[][] result = multiplyMatrices(matrix1, matrix2);

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[0].length; j++) {
        System.out.print(result[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
    int[][] result = new int[matrix1.length][matrix2[0].length];

    for (int i = 0; i < matrix1.length; i++) {
      for (int j = 0; j < matrix2[0].length; j++) {
        for (int k = 0; k < matrix1[0].length; k++) {
          result[i][j] += matrix1[i][k] * matrix2[k][j];
        }
      }
    }

    return result;
  }

}
