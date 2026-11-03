package Com.globalQuest.CoreJavaExceptionHandling;

import java.util.Scanner;
class code1{
	void function1() throws Exception{
		System.err.println("Function 1 Get Started");
		Scanner sc = new Scanner(System.in);
		System.err.println("Division Operation Strated");
		System.err.println("Enter the numerator:");
		int num = sc.nextInt();//critical statement : InputMismatchException
		System.out.println("Enter the dennominator");
		int den = sc.nextInt();//critical statement : InputMismatchException
		int res = num/den;//critical statement : ArithematicException
		System.out.println("Enter the result"+res);
		System.out.println("Division Operation Completed");
		System.out.println("...................");
		System.out.println("Array Operation Strated");
		System.out.println("Enter the array size");
		int n = sc.nextInt();//critical statement : InputMismatchException
		int arr[] = new int[n];//critical statement :NegativeArraySizeException
		System.out.println("Enter the position : ");
		int pos = sc.nextInt();//critical statement : InputMismatchException
		System.out.println("Enter the value :");
		int val = sc.nextInt();//critical statement :InputMismatchException
		arr[pos] = val;//critical statement : ArrayIndexOutOfBoundsException
		System.out.println("Array Operation Completed");
		System.out.println("Function 1 Get Terminated");

	
	}
}
class code2{
	void function2() throws Exception {
		System.out.println("Function 2 Get Started");
		code1 c1 = new code1();
		c1.function1();
		System.out.println("Function 2 Get Terminated");

	}
}
class code3{
	void function3() throws Exception{
		System.out.println("Function 3 Get Started");
		code2 c2 = new code2();
		try {
		  c2.function2();
		}
		catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println("Funtion-3 Terminated");
			throw e;
		}		
	    System.out.println("Function 3 Get Terminated");

	}
}
class code4{
	void function4() throws Exception {
		System.out.println("Function 4 Get Started");
		code3 c3 = new code3();
		c3.function3();
		System.out.println("Function 4 Get Terminated");
	}
}

public class Duckingthrow {
	public static void main(String[] args) {
		System.out.println("Main Started");
		code4 c4 = new code4();
		try {
			c4.function4();
		} catch (Exception e) {
			System.out.println("Exception Handled in Main");
		}
		System.out.println("Main Terminated");
	}
}
