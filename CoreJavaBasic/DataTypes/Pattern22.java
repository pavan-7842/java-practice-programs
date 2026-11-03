package Com.globalQuest.CoreJavaBasic.DataTypes;

import java.util.Scanner;

public class Pattern22 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
		int count=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(count<100) {
					if(count<10) {
			System.out.print("00"+count+" ");
			count++;
				}
				else {
					System.out.print("0"+count+" ");
					count++;
				}
		}else{
			  System.out.print(count+" ");
				count++;
			}
		}
		System.out.println();
	}
	}
}
