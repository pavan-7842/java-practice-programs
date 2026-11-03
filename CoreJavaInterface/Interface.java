package Com.globalQuest.CoreJavaInterface;

//1.2.
//interface Calculator{
//	public abstract void add();
//	static void sub() {
//	}
//	default void div() {
//		
//	}
//}

//3.4.5
//interface Calculator{
//	void add();
//	void sub();
//	void div();
//	int a=100;
//	int b=200;
//	interface Calculator{
//		public abstract void add();
//		public abstract void sub();
//		public abstract void div();
//		public static final int a=100;
//		public static final int b=200;
//	}
//			
//}

//6.7.8.9.10

interface Calculator{
	void add();
	void sub();
	int a=10;
	int b=20;
}
class Calcy1 implements Calculator{
	//@override
	public void add() {
		System.out.println(a+b);
	}
	//@override
	public void sub() {
		System.out.println(b-a);
	}
	
}
