package Com.globalQuest.CoreJavaBasic.Strings;

public class ImmutableStringDis {

	public static void main(String[] args) {
		String str1="Ravana";
		String str2="Sita";
		// case-1
		str1.concat(str2);
		System.out.println(str1);//Ravana
		// case-2
		str1=str1.concat(str2);
		System.out.println(str1);//RavanaSita
		//case-3
		System.out.println(str1.concat(str2));//RavanaSita
	}

}
