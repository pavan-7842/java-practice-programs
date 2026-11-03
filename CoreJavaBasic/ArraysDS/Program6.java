package Com.globalQuest.CoreJavaBasic.ArraysDS;

import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the no: Line of Business:");
				int bus=sc.nextInt();
				System.out.println("Enter the no: of loactions :");
				int loc=sc.nextInt();
				System.out.println("Enter the no: of Branches :");
				int brn=sc.nextInt();
				//creating the array
				int arr[][][]=new int[bus][loc][brn];
				// collecting the data
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside bus NO:"+(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("Inside the loc No:"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println("Enter the of branches:"+(k+1));
							arr[i][j][k]=sc.nextInt();
						}
					}
				}
				// display the data
				System.out.println("==============");
				for(int i=0;i<arr.length;i++) {
					System.out.println("Inside bus NO:"+(i+1));
					for(int j=0;j<arr[i].length;j++) {
						System.out.println("Inside the loc No:"+(j+1));
						for(int k=0;k<arr[i][j].length;k++) {
							System.out.println(" the no Faculty members :"+(k+1)+"is =");
							System.out.println(arr[i][j][k]);
							arr[i][j][k]=sc.nextInt();
						}
					}
				}
			}
		}


