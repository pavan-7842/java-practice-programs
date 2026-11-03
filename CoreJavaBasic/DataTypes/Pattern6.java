package Com.globalQuest.CoreJavaBasic.DataTypes;

import java.util.Scanner;
public class Pattern6 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		for(int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}

}
