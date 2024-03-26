public
class Matrix_Multiplication {
    public static
    void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] matrix2 = {
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
        };

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int[][] resultMatrix = new int[3][3];

        for (int i = 0;i < 3; i++){
            for (int j = 0; j< 3;j++){
                for (int k = 0; k< 3;k ++){
                    resultMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    System.out.print(matrix1[i][k]);
                    System.out.print(" x ");
                    System.out.print(matrix2[k][j]);
                    System.out.print(" = ");
                    System.out.print(resultMatrix[i][j]);
                    System.out.print(" ) + ( ");
                }
                System.out.println();
            }
        }

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3 ; j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
