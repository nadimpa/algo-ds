package com.company;
import java.util.Scanner;

public class Infect {

        public int infectCount(int i, int j, int[][] arr, int r, int c){
            int total = 0;
            int[] r1 = {0, 0, 1, -1};
            int[] c1 = {-1, 1, 0, 0};
            for(int a = 0; a < 4; a++) {
                int row = r1[a] + i;
                int col = c1[a] + j;
                if(row >= 0 && row < r && col >= 0 && col < c) {
                    if(arr[row][col] == 1){
                        total++;
                    }
                }
            }
            return total;
        }

        public int count(int arr[][], int r, int c) {
            int t = 0;
            for(int i = 0; i < r; i++) {
                for(int j = 0; j < c; j++) {
                    if(arr[i][j] == 1) {
                        t++;
                    }
                }
            }
            return t;
        }
        public int[][] infect(int[][] arr, int r, int c) {

            int infectCount = 0;
            int prev = count(arr, r, c);
            int cur;
            while(true) {
                for(int i = 0; i < r; i++) {
                    for(int j = 0; j < c; j++) {
                        if(arr[i][j] == 0) {
                            int total = infectCount(i, j, arr, r, c);
                            if(total >= 2) {
                                arr[i][j] = 1;
                            }
                        }
                    }
                }
                cur = count(arr,r ,c );
                if(cur == prev)
                    break;
                else
                    prev = cur;
            }

            return arr;
        }

        public static void main(String[] args) {
            Infect i1 = new Infect();

            int row = 0;
            int column = 0;

            int[][] matrix = new int[101][101];

            String line;

            Scanner sc = new Scanner(System.in);

            while (!(line = sc.nextLine()).equals("")){
//                String text[] = line.split(" ");
                column = line.length();
//                column = text.length;
//                int[] rowRead = new int[101];
                for(int i = 0;i < column;i++)
                {

                    // Note that this is assuming valid input
                    // If you want to check then add a try/catch
                    // and another index for the numbers if to continue adding the others (see below)
                    matrix[row][i] = Integer.parseInt(Character.toString(line.charAt(i)));
                }
                row++;
            }

            i1.infect(matrix, row, column);
            for(int i = 0; i < row; i++) {
                for(int j = 0; j < column; j++) {
                    System.out.print(matrix[i][j]);
                }
                System.out.println();
            }

        }

}
