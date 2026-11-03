/**
 * 
 */
package Com.globalQuest.CoreJavaBasic.DataTypes;

/**
 * 
 */
public class MethodType3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Multiplication m=new Multiplication();
		System.out.println(m.mul());
	}

}
/**
 * @description
 */
class Multiplication{
	/**
	 * @param args
	 */
	int multiplication()
	{
		int a=10;
		int b=20;
		int c=a*b;
		return c;
	}

	public char[] mul() {
		// TODO Auto-generated method stub
		return null;
	}
}