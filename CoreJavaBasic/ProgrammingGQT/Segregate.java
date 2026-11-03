package Com.globalQuest.CoreJavaBasic.ProgrammingGQT;

import java.util.Scanner;

public class Segregate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String :");
		String str=sc.nextLine();
		String alphabet="";
		String numbers ="";
		String sp_string="";
		for(int i=0;i<str.length();i++) {
			if((str.charAt(i)>=65 && str.charAt(i)<=90) ||
			(str.charAt(i)>=97 && str.charAt(i)<=122)){
				alphabet = alphabet + str.charAt(i);
			}
			else if (str.charAt(i)>=48 && str.charAt(i)<=57) {
				numbers =numbers + str.charAt(i);
			}
			else {
				sp_string =sp_string + str.charAt(i);
			}
		}
		System.out.println("The alphabet are :"+alphabet);
		System.out.println("The numbers are :"+numbers);
		System.out.println("The special characters are :"+sp_string);
	}
}
