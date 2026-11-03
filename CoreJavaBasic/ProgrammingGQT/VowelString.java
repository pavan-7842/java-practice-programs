package Com.globalQuest.CoreJavaBasic.ProgrammingGQT;

import java.util.Scanner;

public class VowelString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String:");
        String str = sc.nextLine();

        System.out.println("---------------");
        System.out.println("The collected String is=" + str);

        int capital_vow_cnt = 0;
        int small_vow_cnt = 0;
        for (int i = 0; i < str.length(); i++) {
            // Capital vowels
            if (str.charAt(i) == 'A' || str.charAt(i) == 'E' ||
                str.charAt(i) == 'I' || str.charAt(i) == 'O' ||
                str.charAt(i) == 'U') {

                capital_vow_cnt++;
            }
            // Small vowels
            else if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                     str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                     str.charAt(i) == 'u') {
                small_vow_cnt++;
            }
        }
        System.out.println("Capital Vowels Count = " + capital_vow_cnt);
        System.out.println("Small Vowels Count = " + small_vow_cnt);
//        System.out.println("Total Vowels Count = " +
//                           (capital_vow_cnt + small_vow_cnt));
    }
}