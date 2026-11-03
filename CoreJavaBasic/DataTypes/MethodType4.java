/**
 * 
 */
package Com.globalQuest.CoreJavaBasic.DataTypes;

/**
 * 
 */
public class MethodType4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Division d=new Division();
		System.out.println(d.Div(20,40));

	}


}
class Division{
	int Div(int a,int b) {
		int c=a/b;
		return c;
	}
}