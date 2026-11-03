package Com.globalQuest.CoreJavaBasic.ArraysDS;
/*
 * i       j     
 * school  class  students
 * 0       0        3
 *         1        3
 *         2        3
 * 1       0        3
 *         1        3
 *         2        3
 * 
 * 
 * 
 * 
 */

import java.util.Scanner;
public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: of schools:");
		int scl=sc.nextInt();
		System.out.println("Enter the no: of classes in each  school:");
		int cls=sc.nextInt();
		System.out.println("Enter the no: of students in each class of the  schools:");
		int stu=sc.nextInt();
		//creating the array
		int arr[][][]=new int[scl][cls][stu];
		// collecting the data
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school NO:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class No:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of students no:"+(k+1));
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
		// display the data
		System.out.println("==============");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside school NO:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class No:"+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" the marks of students no:"+(k+1)+"is =");
					System.out.println(arr[i][j][k]);
					arr[i][j][k]=sc.nextInt();
				}
			}
		}
	}
}
