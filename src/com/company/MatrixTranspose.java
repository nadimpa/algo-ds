package com.company;

import java.util.Scanner;

public class MatrixTranspose {

    public int[][] transpose(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] res = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                res[i][j] = arr[j][i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 0;
        int column = 0;

        int[][] matrix = new int[101][101];
//        String text[] = new String[101];

        String line;

        while (!(line = sc.nextLine()).equals("")){
            String text[] = line.split(" ");
            column = text.length;
            int[] rowRead = new int[101];
            for(int i = 0;i < text.length;i++)
            {
                if(text[i] == "")
                    break;
                // Note that this is assuming valid input
                // If you want to check then add a try/catch
                // and another index for the numbers if to continue adding the others (see below)
                matrix[row][i] = Integer.parseInt(text[i]);
            }
            row++;
        }

        MatrixTranspose matrixTranspose = new MatrixTranspose();
        int[][] res = matrixTranspose.transpose(matrix);
        for(int i=0;i<column; i++) {
            for(int j=0;j<row;j++) {
                System.out.print(res[i][j]);
                if(j<row-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
