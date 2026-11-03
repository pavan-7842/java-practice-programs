package Com.globalQuest.CoreJavaBasic.DataTypes;
import java.util.Scanner;
public class Patternprogramming {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the size");
        int n =9;
        int i,j;
        for(i=1;i<=n;i++ ) {
        		for (j=1; j<=n ;j++) {
        			if (i>=j && i<=n/2+1) {
//        				i+j==n/2+2||i==n||i==(n+1)/2||(j==1 && i>n/2)||(j==n&& i>n/2) ||j-i==n/2
        				System.out.print(i+""+j+" ");
        			}
        			else {
        				System.out.print(" - ");
        			}
        		}
        		System.out.println();
   
        }

	}

}
