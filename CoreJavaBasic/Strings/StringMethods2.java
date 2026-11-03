package Com.globalQuest.CoreJavaBasic.Strings;

public class StringMethods2 {

	public static void main(String[] args) {
		String str="SureshRaina";
		String str1="         ";
		String str2="";
		System.out.println(str);
		System.out.println("---------------");
		
		//isBlank():checks if the string is empty or contains spaces
		boolean blk=str.isBlank();
		System.out.println(blk);
		blk=str1.isBlank();
		System.out.println(blk);
		blk=str2.isBlank();
		System.out.println(blk);
		System.out.println("--------------");
		
		//isEmpty():checks if the string is empty or not 
		boolean empt=str.isEmpty();
		System.out.println(empt);
		empt=str1.isEmpty();
		System.out.println(empt);
		empt=str2.isEmpty();
		System.out.println(empt);
		System.out.println("--------------");
		
		//replace():replaces the current with a new character 
		String replac=str.replace('a','@');
		System.out.println(replac);
		System.out.println("--------------");
		String re=str.replace('p','@');
		System.out.println(re);

	}

}
