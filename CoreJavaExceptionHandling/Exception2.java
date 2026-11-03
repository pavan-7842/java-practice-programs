package Com.globalQuest.CoreJavaExceptionHandling;

import java.util.Scanner;

public class Exception2 {
	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Division Operation Started");
		System.out.println("Enter the numerator");
		int num = sc.nextInt();
		System.out.println("Enter the denominator");
		int den = sc.nextInt();
		int res = num / den;
		System.out.println("Result = "+res);
		System.out.println("Division operation completed");
		System.out.println("------------------");
		System.out.println("Array Operation Started");
		System.out.println("Enter the array size :");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter the imposition");
		int pos = sc.nextInt();
		System.out.println("Enter the value :");
		int val =sc.nextInt();
		arr[pos]=val;
		System.out.println("Array operation completed");
	}
	catch (Exception e) {
		System.out.println("The Exeption is handled in Catch block");
	}
	}
}