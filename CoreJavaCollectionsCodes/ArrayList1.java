package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.ArrayList;
public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(70);
		al.add(175);
		System.err.println(al);
		System.err.println("--------------------");
		
		//Heterogeneous example
		al.add("pavan");//String
		al.add('d');
		al.add(342.53245);//float
		al.add(4324.534345);//double
		System.err.println(al);
		System.err.println("---------------------");
		
		//Duplicate
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(70);
		al.add(175);
		System.err.println(al);
		System.err.println("---------------------");
		
		//front and rear
		al.addFirst(1111);
		al.addLast(99999);
		System.err.println(al);
		System.err.println("----------------------");
		
		//adding at respective positions
		al.add(1,3000);
		System.err.println(al);
		System.err.println("------------------------");
		
		// Adding another collections
		ArrayList al1 = new ArrayList();
		al1.add(700);
		al1.add(60);
		al1.add(250);
		al1.add(85);
		System.err.println(al1);
		System.err.println("--------------------");
		al.add(al1);
		System.err.println(al);
		System.err.println("-------------------");
		
		// adding another collections data individually
		al.addAll(al1);
		System.err.println(al);
		
		// adding another collections data individually at specific positions
		al.addAll(1,al1);
		System.err.println(al);
	}

}
