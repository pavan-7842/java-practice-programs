package Com.globalQuest.CoreJavaMultiThreading;
import java.util.Scanner;

class Addition1 implements Runnable{
	public void run() {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for Addition:");
		int add_1=sc.nextInt();
		System.out.println("Enter the second number for Addition:");
		int add_2=sc.nextInt();
		int res1=add_1+add_2;
		System.out.println(res1);
		System.out.println("Addition Operation Completed");
		System.out.println("------------");
	}
}
class Subtraction1 implements Runnable {
	
	public void run() {
		System.out.println("Subtraction Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for Subtraction:");
		int add_1=sc.nextInt();
		System.out.println("Enter the second number for Subtraction:");
		int add_2=sc.nextInt();
		int res1=add_1-add_2;
		System.out.println(res1);
		System.out.println("Subtraction Operation Completed");
		System.out.println("------------");
	}
}
class Multiplication1 implements Runnable {
	
	public void run() {
		System.out.println("Multiplication Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for Multiplication:");
		int add_1=sc.nextInt();
		System.out.println("Enter the second number for Multiplication:");
		int add_2=sc.nextInt();
		int res1=add_1*add_2;
		System.out.println(res1);
		System.out.println("Multiplication Operation Completed");
		System.out.println("--------------");
	}
}
class Division1 implements Runnable{
	
	public void run() {
		System.out.println("Division Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for Division:");
		int add_1=sc.nextInt();
		System.out.println("Enter the second number for Division:");
		int add_2=sc.nextInt();
		int res1=add_1/add_2;
		System.out.println(res1);
		System.out.println("Division Operation Completed");
		System.out.println("-----------");
	}
}
class Printing1 implements Runnable{
	
	public void run() {
		try {
			System.out.println("Printing Started");
			for(int i=1;i<=5;i++) {
				System.out.println("Welcome to India");
				Thread.sleep(2000);
			}
			System.out.println("Printing Ended");
		}
		catch (Exception e) {
			System.out.println("Exception is Hnadled in The catch block");
		}
	}
}
public class MultiRunnable {
	public static void main(String[] args) {
		System.out.println("Main() started");
		Addition1 ad = new Addition1();
		Subtraction1 sb= new Subtraction1();
		Multiplication1 ml =new Multiplication1();
		Division1 dv= new Division1();
		Printing1 pt=new Printing1();
			
//		ad.run();//Leads to Single thread problem
//		sb.run();//Leads to Single thread problem
//		ml.run();//Leads to Single thread problem
//		dv.run();//Leads to Single thread problem
//		pt.run();//Leads to Single thread problem
		
		Thread t1=new Thread(ad);
		Thread t2=new Thread(sb);
		Thread t3= new Thread(ml);
		Thread t4=new Thread(dv);
		Thread t5=new Thread(pt);
				
		//allocating thread objects to thread scheduler
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		System.out.println("Main() terminated");
	}
}