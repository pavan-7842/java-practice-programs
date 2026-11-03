package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;
public class Program5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no: of schools:");
		int scl=sc.nextInt();
		//creating the array
		int arr[][][]=new int[scl][][];
		
		//collecting the class count 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the no:classes in school no:"+(i+1));
			arr[i]=new int[sc.nextInt()][];
		}
		// collecting the students in each class of the school
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside school NO:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
			System.out.println("Enter the no: of students in class no:"+(j+1));
			arr[i][j]=new int[sc.nextInt()];
		}
	}
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
