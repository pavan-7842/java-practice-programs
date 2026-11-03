package Com.globalQuest.CoreJavaBasic.Strings;

public class MutableString {

	public static void main(String[] args) {
		// String Buffer
		StringBuffer sb1 =new StringBuffer("Rama");
		StringBuffer sb2 = new StringBuffer("Sita");
		sb1.append(sb2);
		System.out.println(sb1);
		System.out.println("---------------");
		
		StringBuilder sb3=new StringBuilder("Raina");
		StringBuilder sb4=new StringBuilder("Priya");
		sb3.append(sb4);
		System.out.println(sb3);	
	}
}
