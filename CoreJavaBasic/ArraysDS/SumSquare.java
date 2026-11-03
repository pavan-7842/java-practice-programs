package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;

public class SumSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int sum = 0;
        // Finding sum of diagonal elements
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    sum = sum + matrix[i][j];
                }
            }
        }

        // Square of the sum
        int result = sum * sum;
        System.out.println("Sum of diagonal elements: " + sum);
        System.out.println("Square of the sum: " + result);
    }
}