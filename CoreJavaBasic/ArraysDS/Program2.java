package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;
public class Program2 {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the total no classes:");
	int cls=sc.nextInt();
	System.out.println("Enter the total number of students in each class:");
	int stu=sc.nextInt();
	// creating the array
	String arr[][]=new String[cls][stu];
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
