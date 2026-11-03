package Com.globalQuest.CoreJavaBasic.ArraysDS;


import java.util.Scanner;
public class Program7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row size of the matrix:");
		int a=sc.nextInt();
		System.out.println("Enter the column size of the matrix:");
		int b=sc.nextInt();
		
		//creating the matrix
		int m1[][] = new int[a][b];
		int m2[][] = new int[a][b];
		int res[][] = new int[a][b];
		System.out.println("---------------");
		
		//adding values to the matrix
		System.out.println("Enter the matrix M1:");
		for(int i=0;i<m1.length;i++) {
			for(int j=0;j<m1[i].length;j++) {
				m1[i][j]=sc.nextInt();
			}
		}
		System.out.println("-------------");
		System.out.println("Enter the matrix M2:");
		for(int i=0;i<m2.length;i++) {
			for(int j=0;j<m2[i].length;j++) {
				m2[i][j]=sc.nextInt();
			}
		}
		//performing the addition of 2 matrix
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				res[i][j]=m1[i][j]+m2[i][j];
			}
		}
		System.out.println("---------------");
		
		//displaying the addition of 2 matrix result 
     	System.out.println("Resultant Matrix:");
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++) {
				System.out.print(res[i][j]+"  ");
			}
			System.out.println();
		}
	}
}
