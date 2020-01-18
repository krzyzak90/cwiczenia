package org.lukasz.succes;

import javax.imageio.ImageReader;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1, 0, 1},
                {1, 1, 0, 3},
                {1, 0, 1},
        };

//        int[] row = matrix[0];
//        int cell1 = row[0];
//        int cell2 = matrix[0][0];
//        matrix[0][0] = 5;
//        matrix[1] = new int[]{5, 6, 7};

        for (int[] row: matrix) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }

        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                System.out.println(matrix[x][y]);
            }

        }
    }
}
