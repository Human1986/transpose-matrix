package com.epam.rd.autotasks.matrices;

import java.util.Arrays;

public class TransposeMatrix {


    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int column = matrix[0].length;
         int[][] transposed = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                    transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void main(String[] args) {

        int[][] a = {{1, 2}, {7, - 13}};  // int[][] expected = {{1, 7}, {2, -13}};

        int[][] b = {{- 4, - 65, 56}, {78, - 13, 32}}; // int[][] expected = {{-4, 78}, {-65, -13}, {56, 32}};

        System.out.println(Arrays.deepToString(transpose(a)));
    }
}