/**
 * 
 */
package Com.globalQuest.CoreJavaBasic.DataTypes;

/**
 * 
 */
public class MethodType1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Addtion a=new Addtion();
		a.add();
	}

}

/**
 * @description
 */
class Addtion{
	/**
	 * @param no parameters
	 */
	void add()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
}