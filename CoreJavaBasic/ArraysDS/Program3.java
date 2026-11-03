package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;
public class Program3 {
	public static void main(String[] args ) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of classes:");
		int cls=sc.nextInt();
		//creating the array
		String arr[][]=new String[cls][];
		//Collecting the student count in each class
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count inside classroom no:"+(i+1));
			arr[i]=new String[sc.nextInt()];
		}
		//Collecting the students names;
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the classroom no:"+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of student no:"+(j+1));
				arr[i][j]=sc.next();
				System.out.println("-----------");
			}
		}
		System.out.println("================");
		//display the students names;
			for(int i=0;i<arr.length;i++) {
				System.out.println("Inside the classroom no:"+(i+1));
				for(int j=0;j<arr.length;j++) {
					System.out.println("Enter the name of student no:"+(j+1)+"is ="+
				arr[i][j]);
					arr[i][j]=sc.next();
					System.out.println("-----------");
				}
			}
	}
}
