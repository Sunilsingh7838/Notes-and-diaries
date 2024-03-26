public
class Matrix_Addition {
    public static
    void main(String[] args) {

        int [][] matrix1 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int [][] matrix2= {
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };

        int rows = matrix1.length;
        int columns = matrix1[0].length;

        int [][] resultMatrix = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };

        for (int i = 0; i < rows; i++){
            for (int j = 0; j <columns; j++){
                 resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i =0;i<rows;i++){
            for (int j = 0;j<columns;j++){
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
