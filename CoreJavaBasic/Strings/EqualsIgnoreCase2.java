package Com.globalQuest.CoreJavaBasic.Strings;

public class EqualsIgnoreCase2 {

	public static void main(String[] args) {
		String s1="Virat";
		String s2="Virat";
		String s3="Anushka";
		String s4="virat";
		//Above representation is Object based representation
		
		//Comparing s1&s2
				if(s1.length()==s2.length())
				{
				if(s1.equalsIgnoreCase(s2))
				{
					System.out.println("String are equal");
				}
				else {
					System.out.println("String are unequals");
				}
			}
				else {
					System.out.println("String are unequals");
				}
				//comparing s1&s3
				if(s1.length()==s3.length())
				{
					if(s1.equalsIgnoreCase(s3))
					{
						System.out.println("String are equal");
					}
					else {
						System.out.println("String are unequals ");
					}
				}
					else {
						System.out.println("String are unequals");
					}
					// Comparing s1&s4
					if(s1.length()==s4.length())
					{
						if(s1.equalsIgnoreCase(s4))
						{
							System.out.println("String are equal");
						}
						else {
							System.out.println("String are unequals ");
						}
					}
					else {
						System.out.println("String are unequals");
					}
	}

}
