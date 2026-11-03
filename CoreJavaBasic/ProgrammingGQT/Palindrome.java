package Com.globalQuest.CoreJavaBasic.ProgrammingGQT;

import java.util.Scanner;
//2.WAP to check if the given string is palindrome or not
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("---------------");
		System.out.println("The collected String is="+str);
		String new_str="";
		for(int i=str.length()-1;i>=0;i--) {
			new_str=new_str + str.charAt(i);
		}
		System.out.println("Reversed String ="+new_str);
		System.out.println("---------------");
		if(str.equals(new_str)) {
			System.out.println("The string is palindrome");
		}
		else {
			System.out.println("The string is Not palindrome");
		}
	}

}
