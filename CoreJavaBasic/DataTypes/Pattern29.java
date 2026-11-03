package Com.globalQuest.CoreJavaBasic.DataTypes;

import java.util.Scanner;

public class Pattern29 {

	public static void main(String[] args) {
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter size:");
			int n=sc.nextInt();
//			for(int i=1;i<=n;i++) {
//				for(int j=1;j<=n;j++) {
//					System.out.print("*");
//				}
//				for(int j=1;j<=n;j++) {
//					System.out.print("#");
//				}
//				System.out.println();
//			}
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=i;j++) {
					System.out.print("*");
				}
				for(int j=1;j<=n;j++) {
					System.out.print("#");
				}
				System.out.println();
			}

	}

}
