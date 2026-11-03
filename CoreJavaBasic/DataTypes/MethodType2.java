/**
 * 
 */
package Com.globalQuest.CoreJavaBasic.DataTypes;

/**
 * 
 */
public class MethodType2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Subtraction a =new Subtraction();
		a.sub(40,20);

	}

}
/**
 * @description
 */
class Subtraction{
	/**
	 * @param 
	 */
	void sub(int a,int b)
	{
		int c=a-b;
		System.out.println(c);
	}
		
	}