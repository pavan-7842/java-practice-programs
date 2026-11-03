package Com.globalQuest.CoreJavaBasic.Strings;

public class BuiltInMethodsInStrings {
	public static void main(String[] args) {
		String str="SureshRaina";
		System.out.println(str);
		System.out.println("--------------");
		
		//1.length()
		int length=str.length();
		System.out.println("The length of the string is="+length);
		System.out.println("---------------");
		
		//2.chartAt(int i)
		char c1=str.charAt(0);
		System.out.println(c1);
		c1=str.charAt(length-1);
		System.out.println(c1);
//		c1=str.charAt(100);//--->Leads to exception
//		System.out.println(c1);
		System.out.println("-----------");
		
		//3.concat(String s)
		String new_str=str.concat("is the best batsman");
		System.out.println(str);
		System.out.println(new_str);
		String new_str1=str+"has more than 50 hundreds";
		System.out.println(new_str1);
		System.out.println(str);
		str=str+": this is changed";
		System.out.println(str);
		System.out.println("----------------------");
		
		
		
	}

}
