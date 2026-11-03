package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;

public class StatementProb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the language count:");
		int lang=sc.nextInt();
		long invesment=7000000000l;
		long old_profit=3000000000l;
		long invest_Kanada=2500000000l;
		long invest_hindi=1500000000l;
		long invest_tamil=3000000000l;
		long arr[][]=new long[lang][];
		long overall_rev=0;
		long arr1[]=new long[lang];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Movie count for lang no:"+(i+1));
			arr[i]=new long[sc.nextInt()];
		}
		System.out.println("-------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("Collecting data for language no:"+(i+1));
			long rev=0;
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the revenue mafe by movie no:"+(j+1));
				arr[i][j]=sc.nextInt();
				rev=rev+arr[i][j];
				overall_rev=overall_rev+arr[i][j];
			}
			arr1[i]=rev;
		}
		System.out.println("----------------");
		for(int i=0;i<arr1.length;i++) {
			System.out.println("Collecting data for language no:"+(i+1));
			long rev=0;
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The revenue made by movies no:"+(j+1)+"is ="+arr[i][j]);
			}
		}
		System.out.println("-----------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("The revenue made by lang no:"+(i+1)+"is="+arr1[i]);
		}
	}
}
