package Com.globalQuest.CoreJavaBasic.ProgrammingGQT;

import java.util.Scanner;

public class VowelSum {
    public static void main(String[] args) {
        System.out.println("Enter the String:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("---------------");
        System.out.println("The collected String is=" + str);
        
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
                str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
                str.charAt(i) == 'U') {
                sum = sum + str.charAt(i);
            }
        }
        System.out.println("Sum of ASCII values of vowels = " + sum);
    }
}