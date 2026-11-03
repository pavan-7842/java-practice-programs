package Com.globalQuest.CoreJavaBasic.Strings;

public class StringMethods {
	public static void main(String[] args) {
		String str="SureshRaina";
		System.out.println(str);
		System.out.println("---------------");
		//contains(string s):check if the sub-string is present in the String
		boolean res1=str.contains("raina");
		System.out.println(res1);
		System.out.println("-------------");
		res1=str.contains("Raina");
		System.out.println(res1);
		System.out.println("--------------");
		res1=str.contains("Raghu");
		System.out.println(res1);
		System.out.println("##############");
		
		//endsWith(String s):checks if the main string ends with the given string
		boolean res2=str.endsWith("Rahul");
		System.out.println(res2);
		System.out.println("---------------");
		res2=str.endsWith("ina");
		System.out.println(res2);
		System.out.println("-----------");
		res2=str.endsWith("Pendulkar");
		System.out.println(res2);
		System.out.println("############");
		
		//startsWith(String s):checks if the main starts with the given sub-strings
		boolean res3=str.startsWith("Sachin");
		System.out.println(res3);
		System.out.println("-------------");
		res3=str.startsWith("Sur");
		System.out.println(res3);
		System.out.println("----------------");
		res3=str.startsWith("Pachin");
		System.out.println(res3);
		System.out.println("#################");
		
		//toUpperCase():convert the main string into upper case
		String upper=str.toUpperCase();
		System.out.println(upper);
		System.out.println("-------------------");
		
		//toLowercase():convert the main string into lower case
		String lower = str.toLowerCase();
		System.out.println(lower);
		
		
		//getBytes():It will provide an array of ascii values of character in the string.
		byte[] ar=str.getBytes();
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
		System.out.println("----------------");
		
		//getclass():return the class to which the object of the class
		Class cls=str.getClass();
		System.out.println(cls);
		System.out.println("-----------------");
		
		//hascode():Provide the unique value for the object string to the class
		int hashCode=str.hashCode();
		System.out.println(hashCode);
		System.out.println("--------------------");
		//indexOf(char c):provides the position values of the String
		int indx=str.indexOf('S');
		System.out.println(indx);
		indx=str.indexOf('R');
		System.out.println(indx);
		indx=str.indexOf('r');
		System.out.println(indx);
		indx=str.indexOf('z');
		System.out.println(indx);
		System.out.println("-------------");
		
		//lastIndexOf(char s):provide the last position value of the string
	    indx=str.lastIndexOf('S');
		System.out.println(indx);
		indx=str.lastIndexOf('R');
		System.out.println(indx);
		indx=str.lastIndexOf('r');
		System.out.println(indx);
		indx=str.lastIndexOf('z');
		System.out.println(indx);
		System.out.println("-------------");
		
		
		
		
		

	}

}
