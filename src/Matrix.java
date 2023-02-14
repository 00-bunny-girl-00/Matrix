public class Matrix {
    float[][] mat1;
    int rowSize;
    int colSize;

    public Matrix(float[][] mat1, int rowSize, int colSize) {
        this.mat1 = mat1;
        this.rowSize = rowSize;
        this.colSize = colSize;
    }

    public float[][] addition(float[][] M, int rowSize, int colSize){
        float C[][] = new float[rowSize][colSize];

        for (int i = 0; i < rowSize; i++)
            for (int j = 0; j < colSize; j++)
                C[i][j] = (int) (this.mat1[i][j]) + M[i][j];

        return C;
    }

    public float[][] multiplicationNum(float[][] M, int rowSize, int colSize, int num){
        float C[][] = new float[rowSize][colSize];

        for (int i = 0; i < rowSize; i++)
            for (int j = 0; j < colSize; j++)
                C[i][j] = (int) (this.mat1[i][j]) * num;

        return C;
    }

    public float[][] multiplication(float[][] M, int rowSize, int colSize){
        float C[][] = new float[rowSize][colSize];

        for (int i = 0; i < rowSize; i++)
            for (int j = 0; j < colSize; j++)
                for (int k = 0; k < mat1[0].length; k++)
                    C[i][j] = C[i][j] + mat1[i][k] * M[k][j];
        return C;
    }

    public void print(float[][] M){
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < colSize; j++)
                System.out.print(M[i][j] + " ");

            System.out.println();
        }
        System.out.println();
    }
}
