public
class matrix_transpose {
    public static void OriginalMatrix(int [][] matrix){
        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i =0;i<rows; i++){
            for (int j =0; j<columns; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int[][] TransposeOfMatrix(int [][] matrix){
        int rows = matrix.length;
        int col = matrix[0].length;

        int [][] transposedMatrix = new int[rows][col];

        for (int i = 0; i<rows;i++){
            for (int j = 0; j<col;j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static
    void main(String[] args) {
        int [][] mat = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println("Original matrix");
        OriginalMatrix(mat);

        System.out.println("Transpose matrix");
        int [][] Tmatrix = TransposeOfMatrix(mat);
        for (int i =0; i<3; i++){
            for (int j= 0; j<3; j++){
                System.out.print(Tmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
