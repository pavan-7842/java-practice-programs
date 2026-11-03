package Com.globalQuest.CoreJavaBasic.Strings;

public class ReferencesString {

	public static void main(String[] args) {
		String s1="Virat";
		String s2="Virat";
		String s3="Anushka";
		String s4="virat";
		//Above representation is String literal representation
		
		//comparing s1&s2
		if(s1==s2) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are unEqual");
		}
		System.out.println("-------------");
		
		//Comparing s1&s3
		if(s1==s3) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are unEqual");
		}
		// Comparing s1&s4
		if(s1==s4) {
			System.out.println("References are Equal");
		}
		else {
			System.out.println("References are unEqual");
		}
	}
}
