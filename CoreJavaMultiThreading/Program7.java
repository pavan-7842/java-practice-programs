package Com.globalQuest.CoreJavaMultiThreading;

import java.util.Scanner;
class Operations extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("banking")) {
            banking();
        } 
        else if (Thread.currentThread().getName().equals("printing")) {
            printing();
        } 
        else {
            addition();
        }
    }

    void banking() {

        System.out.println("Banking operation started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the accno:");
        int accno = sc.nextInt();
        System.out.println("Enter the pin:");
        int pin = sc.nextInt();
        System.out.println("Banking operation completed");
    }

    void printing() {
        try {
            System.out.println("Printing operation Started");
            for (int i = 0; i <= 5; i++) {
                System.out.println("Hello I am printing.............");
                Thread.sleep(3000);
            }
            System.out.println("Printing operation completed");
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    void addition() {
        System.out.println("Addition operation started");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1:");
        int n1 = sc.nextInt();
        System.out.println("Enter the num2:");
        int n2 = sc.nextInt();
        int result = n1 + n2;
        System.out.println("Addition result: " + result);
        System.out.println("Addition operation completed");
    }
}

public class Program7 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Operations op1 = new Operations();
        Operations op2 = new Operations();
        Operations op3 = new Operations();
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println("-----");
        op1.setName("banking");
        op2.setName("printing");
        op3.setName("addition");
        System.out.println(op1);
        System.out.println(op2);
        System.out.println(op3);
        System.out.println("-----");

        try {
            op1.start();
            op1.join(3000);
            op2.start();
            op2.join(3000);
            op3.start();
            op3.join(3000);
        } 
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Terminated");
    }
}