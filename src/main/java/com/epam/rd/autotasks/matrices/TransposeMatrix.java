package com.epam.rd.autotasks.matrices;
import java.util.Arrays;

public class TransposeMatrix {
    public static int[][] transpose(int[][] matrix) {

      int[][] matrixArray = new int[matrix.length][matrix.length];

        int i, j;
        for (i = 0; i < matrix.length; i++) {
            for (j = 0; j < matrix.length; j++) {
                matrixArray[i][j] = matrix[j][i];
            }
        }
        return matrixArray;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }

}
