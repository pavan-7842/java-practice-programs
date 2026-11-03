package Com.globalQuest.CoreJavaBasic.DataTypes;


	class Calculator{
		void addition() {
			int a=10;
			int b=20;
			int res=a+b;
			System.out.println(res);
		}
		void subtraction(int a,int b) {
			int m=a;
			int n=b;
			int res=a-b;
			System.out.println(res);
		}
		void multiply(int a, int b) {
			int res=a*b;
			System.out.println(res);
		}
	}
	public class LocalVariable {
	public static void main(String[] args) {
		Calculator c=new Calculator();
		c.addition();
		c.subtraction(200, 184);
		c.multiply(30, 40);
	}

}
