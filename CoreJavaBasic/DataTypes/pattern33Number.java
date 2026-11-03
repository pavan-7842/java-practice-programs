package Com.globalQuest.CoreJavaBasic.DataTypes;

import java.util.Scanner;
public class pattern33Number {
	public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter The Size");
			int n = sc.nextInt();
			 
			for(int i = 0; i <= n-1; i++)
			{
			//1//
				for(int j=0; j<=n-1; j++)
				{
					if((i == 0 && j != 0 && j != n - 1) || 
		                    (i == n - 1 && j != 0 && j != n - 1) || 
		                    (j == 0 && i != 0 && i != n - 1) || 
		                    (j == n - 1 && i != 0 && i != n - 1)) {
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
			
				}
			//1//
				for(int j=0; j<=n-1; j++)
				{
					if(i+j==(n/2) || j==(n/2) || i==(n-1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}	
			//2//
				for(int j=0; j<=n-1; j++)
				{
					if((i == 0 &&  j != n - 1) || 
		                    (j == n - 1 && i > 0 && i <=(n/2)) || 
		                    (i == (n/2)) || 
		                    (j == 0 && i >= (n/2) && i < n - 1) || 
		                    (i == n - 1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//3//
				for(int j=0; j<=n-1; j++)
				{
					if(i==0 || i==(n/2) || i==(n-1) || j==(n-1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//4//
				for(int j=0; j<=n-1; j++)
				{
					if(j==(n/2) || i+j==(n/2) || i==(n/2)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//5//
				for(int j=0; j<=n-1; j++)
				{
					if(i == 0 || 
		                    (j == 0 && i <= (n/2)) || 
		                    (i == (n/2) && j != n - 1) || 
		                    (j == n - 1 && i >=(n/2) && i < n - 1) || 
		                    (i == n - 1 && j != n - 1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//6//
				for(int j=0; j<=n-1; j++)
				{
					if((i == 0 && j != 0) || 
		                    (j == 0 && i != 0 && i != n - 1) || 
		                    (i == (n/2) && j != n - 1) || 
		                    (j == n - 1 && i > (n/2) && i < n - 1) || 
		                    (i == n - 1 && j != 0 && j != n - 1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//7//
				for(int j=0; j<=n-1; j++)
				{
					if(i==0 || i+j==(n-1) ){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//8//
				for(int j=0; j<=n-1; j++)
				{
					if((i == 0 && j != 0 && j != n - 1) || 
		                    (i == (n/2) && j != 0 && j != n - 1) || 
		                    (i == n - 1 && j != 0 && j != n - 1) || 
		                    (j == 0 && i != 0 && i != (n/2) && i != n - 1) || 
		                    (j == n - 1 && i != 0 && i != (n/2) && i != n - 1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
			//9//
				for(int j=0; j<=n-1; j++)
				{
					if((i == 0 && j != 0 && j != n - 1) || 
		                    (j == 0 && i > 0 && i <=(n/2)) || 
		                    (i == (n/2) && j != 0 && j != n - 1) || 
		                    (j == n - 1 && i != 0 && i != n - 1) || 
		                    (i == n - 1 && j != n - 1)){
						System.out.print("# ");
					}
					else {
						System.out.print("  ");
					}
				}
				System.out.println();
	         }
		}
	}
