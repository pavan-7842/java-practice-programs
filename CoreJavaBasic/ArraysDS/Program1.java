package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// Collecting student count
		System.out.println("Enter the count of students:");
		int n=sc.nextInt();
		//Creating the array of size n
		int arr[]=new int[n];
		//Collecting the students marks
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of students no:"+(i+1));
			arr[i]=sc.nextInt();
			System.out.println("-----------");
		}
		System.out.println("================");
		//Dispaly the students marks 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the marks of students no:"+(i+1)+"is="+arr[i]);
			arr[i]=sc.nextInt();
			System.out.println("-----------");
		}
	}

}
