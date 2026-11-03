package Com.globalQuest.CoreJavaBasic.ProgrammingGQT;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String :");
		String st1=sc.next();
		System.out.println("Enter the Second String : ");
		String st2=sc.next();
		char c1[] =new char[st1.length()];
		char c2[] =new char[st2.length()];
		
		//step-1: check the length of the strings 
		if(st1.length()==st2.length()) {
			//step2: Convert the String into a char array
//			for(int i=0;i<st1.length();i++) {
//				c1[i]=st1.charAt(i);
//			}
//			for(int i=0;i<st2.length();i++) {
//				c2[i]=st1.charAt(i);
//			}
			
			c1=st1.toCharArray();
			c2=st2.toCharArray();
			
			//step3: sort the array
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			//step:4 check equality of the strings
			if(Arrays.equals(c1, c2)==true) {
				System.out.println("Strings are anagrams");
			}
			else {
				System.out.println("Strings are not anagrams");
			}
		}
		else {
			System.out.println(" The Strings are not anagrams");
		}
	}

}
