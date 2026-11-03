package Com.globalQuest.CoreJavaExceptionHandling;

import java.util.Scanner;
class Code1{
	void function1() throws Exception{
		System.out.println("Function 1 Get Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Division Operation Strated");
		System.out.println("Enter the numerator:");
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
class Code2{
	void function2() throws Exception {
		System.out.println("Function 2 Get Started");
		Code1 c1 = new Code1();
		c1.function1();
		System.out.println("Function 2 Get Terminated");

	}
}
class Code3{
	void function3() throws Exception{
		System.out.println("Function 3 Get Started");
		Code2 c2 = new Code2();
try {
		c2.function2();

		} catch (Exception e) {
			
		}		
	System.out.println("Function 3 Get Terminated");

	}
}
class Code4{
	void function4() throws Exception {
		System.out.println("Function 4 Get Started");
		Code3 c3 = new Code3();
		c3.function3();
		System.out.println("Function 4 Get Terminated");
	}
}

public class Ducking {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Code4 c4 = new Code4();
		try {
			c4.function4();
		} catch (Exception e) {
			System.out.println("Exception Handled in Main");
		}
		System.out.println("Main Terminated");
	}
}




	
