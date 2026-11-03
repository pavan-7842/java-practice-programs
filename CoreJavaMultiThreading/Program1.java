package Com.globalQuest.CoreJavaMultiThreading;
import java.util.Scanner;
class Addition extends Thread{
	@Override
	public void run() {
		System.out.println("Addition Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for addition:");
		int add_1  = sc.nextInt();
		System.out.println("Enter the Second number for addition:");
		int add_2 = sc.nextInt();
		int res1 = add_1 + add_2;
		System.out.println(res1);
		System.out.println("Addition Operation Completed ");
	}
}
	class Subtraction extends Thread{
	    @Override
		public void run() {
		System.out.println("Subtraction Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for subtraction:");
		int sub_1  = sc.nextInt();
		System.out.println("Enter the Second number for subtraction:");
		int sub_2 = sc.nextInt();
		int res2 = sub_1 - sub_2;
		System.out.println(res2);
		System.out.println("Subtraction Operation Completed ");
		}
	}
	  class Multiplication extends Thread{
	      @Override
		public void run() {
		System.out.println("Multiplication Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for multiplication:");
		int mul_1  = sc.nextInt();
		System.out.println("Enter the Second number for multiplication:");
		int mul_2 = sc.nextInt();
		int res3 = mul_1 * mul_2;
		System.out.println(res3);
		System.out.println("Multiplication Operation Completed ");
	}
  }
	  class Division extends Thread{
		  @Override
		public void run() {
		System.out.println("Division Operation Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number for division:");
		int div_1  = sc.nextInt();
		System.out.println("Enter the Second number for division:");
		int div_2 = sc.nextInt();
		int res4 = div_1 / div_2;
		System.out.println(res4);
		System.out.println("Division Operation Completed ");
	}
}
		
		class Printing extends Thread{
			@Override
			public void run() {
				try {
					System.out.println("Printing Started");
					for(int i=1;i<=5;i++) {
						System.out.println("Welcome to India");
						Thread.sleep(2000);
					}
					System.out.println("Printing Terminated");
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}		
public class Program1 {
	public static void main(String[] args) {
		System.out.println("main() started");
		Addition ad = new Addition();
		Subtraction sb = new Subtraction();
		Multiplication ml = new Multiplication();
		Division dv = new Division();
		Printing pt = new Printing();
		
//		ad.run();//Leads to singled threaded problem
//		sb.run();
//		ml.run();
//		dv.run();
//		pt.run();
		
		System.out.println(Thread.currentThread());
		System.out.println(ad);
		System.out.println(sb);
		System.out.println(ml);
		System.out.println(dv);
		System.out.println(pt);
		
		//allocating thread objects to thread scheduler
		ad.start();
		sb.start();
		ml.start();
		dv.start();
		pt.start();
		
	}
}


