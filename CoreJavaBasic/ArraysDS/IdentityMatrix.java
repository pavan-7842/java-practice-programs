package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;

public class IdentityMatrix {
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
        
        // Checking Identity Matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {

                    // Diagonal element must be 1
                    if (matrix[i][j] != 1) {
                        System.out.println("Not an Identity Matrix");
                        System.exit(0);
                    }

                } else {

                    // Non-diagonal element must be 0
                    if (matrix[i][j] != 0) {
                        System.out.println("Not an Identity Matrix");
                        System.exit(0);
                    }
                }
            }
        }
        System.out.println("Identity Matrix");
    }
}