package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;
public class calculatorSwitchcase {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int n=sc.nextInt();
		System.out.println("Enter the  First Value");
		int a=sc.nextInt();
		System.out.println("Enter the  second Value");
		int b=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println(a+b);
			break;
		case 2:
			System.out.println(a-b);
			break;
		case 3:
			System.out.println(a*b);
			break;
		case 4:
			System.out.println(a/b);
			break;
		case 5:
			System.out.println(a%b);
			break;
			default:
				System.out.println(" ");
			
		}	
	}
}
