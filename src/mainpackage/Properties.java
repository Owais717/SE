package mainpackage;

import java.util.Arrays;

public class Properties {
    Operations op = new Operations();

    void isPeriodic(int[][] matrix,int rows){
        int[][] matrixR = op.multiplyMatrix(rows, rows, rows, rows, matrix, matrix);
        for (int i = 1; i <=5; i++){
            matrixR = op.multiplyMatrix(rows,rows,rows,rows,matrix,matrixR);
            if(Arrays.deepEquals(matrixR,matrix)){
                System.out.println("Periodic: True at Period: " + i);
                return;
            }
        }
        System.out.println("Periodic: False");
    }
    void isInvolutory(int[][] matrix, int rows){
        int[][] matrixR = matrix;
        int[][] identityMatrix =  identity(rows);
        matrixR = op.multiplyMatrix(rows,rows,rows,rows,matrix,matrixR);
        if (Arrays.deepEquals(matrixR,identityMatrix)){
            System.out.println("Involutory: True");
        }
        else {
            System.out.println("Involutory: False");
        }
    }
    static int[][] identity(int num)
    {
        int row, col;
        int[][] identityMatrix = new int[num][num];
        for (row = 0; row < num; row++)
        {
            for (col = 0; col < num; col++)
            {
                // Checking if row is equal to column
                if (row == col)
                    identityMatrix[row][col] = 1;
                else
                    identityMatrix[row][col] = 0;
            }
        }
        return identityMatrix;
    }

}