package Com.globalQuest.CoreJavaMultiThreading;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for addition:");
		int add_1  = sc.nextInt();
		System.out.println("Enter the Second number for addition:");
		int add_2 = sc.nextInt();
		int res1 = add_1 + add_2;
		System.out.println(res1);
		System.out.println("Addition Operation Completed ");
		
		System.out.println("Subtraction Operation Started");
		System.out.println("Enter the first number for subtraction:");
		int sub_1  = sc.nextInt();
		System.out.println("Enter the Second number for subtraction:");
		int sub_2 = sc.nextInt();
		int res2 = sub_1 - sub_2;
		System.out.println(res2);
		System.out.println("Subtraction Operation Completed ");
		
		System.out.println("Multiplication Operation Started");
		System.out.println("Enter the first number for multiplication:");
		int mul_1  = sc.nextInt();
		System.out.println("Enter the Second number for multiplication:");
		int mul_2 = sc.nextInt();
		int res3 = mul_1 * mul_2;
		System.out.println(res3);
		System.out.println("Multiplication Operation Completed ");
		
		System.out.println("Division Operation Started");
		System.out.println("Enter the first number for division:");
		int div_1  = sc.nextInt();
		System.out.println("Enter the Second number for division:");
		int div_2 = sc.nextInt();
		int res4 = div_1 / div_2;
		System.out.println(res4);
		System.out.println("Division Operation Completed ");
	}

}
