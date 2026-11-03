package Com.globalQuest.CoreJavaExceptionHandling;

import java.util.Scanner;

class InvalidAccnoException extends Exception{
	@Override
	public String getMessage(){
		return "The entered account no is invalid";
	}
}
class InvaliPinnoException extends Exception{
	@Override
	public String getMessage(){
		return "The entered Pin no is invalid";
	}
}

class Customer{
	int accno = 2345;
	int pin  =1234;
	int accno_new;
	int pin_new;
	
	void collectData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Accno:");
		accno_new = sc.nextInt();
		System.out.println("Enter the pin:");
		pin_new = sc.nextInt();
	}
	void validata()throws Exception{
		if(accno==accno_new) {
			if(pin==pin_new) {
				System.out.println("valid User");
			}
			else {
				InvaliPinnoException ipe = new InvaliPinnoException();
				System.out.println(ipe.getMessage());
				throw ipe;
			}
		}
		else {
			InvalidAccnoException iae = new InvalidAccnoException();
			System.out.println(iae.getMessage());
			throw iae;
		}
	}
}
class ATM{
    void transaction(Customer c) {
	try {
		c.collectData();
		c.validata();
	}
	catch (Exception e1){
		try {
		c.collectData();
		c.validata();
	}
	catch (Exception e2) {
		try {
			c.collectData();
			c.validata();
		}
		catch (Exception e3) {
			System.out.println("User is Blocked");
			System.exit(0);
				}
			}
    	}
	}
}

public class Lanuch {
	public static void main(String[] args) {
		Customer c1 = new Customer();
		ATM a = new ATM();
		a.transaction(c1);
		
	
}
}