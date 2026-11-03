/**
 * 
 */
package Com.globalQuest.CoreJavaBasic.DataTypes;

/**
 * 
 */
public class ImplicitTypeCastingExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		byte bt=126;
		System.out.println("The Byte Data is ="+bt);
		System.out.println("------------");
		short st=bt;
		System.out.println("The Short Data is ="+st);
		System.out.println("-------------");
		int it=st;
		System.out.println("The Integer Data is ="+it);
		System.out.println("-------------");
		long ln=it;
		System.out.println("The Long Data is ="+ln);
		System.out.println("-------------");
		float ft=123.756f;
		System.out.println("The float Data is ="+ft);
		System.out.println("-------------");
		double db=ft;
		System.out.println("The Double Data is ="+db);
		System.out.println("-------------");
	}

}
