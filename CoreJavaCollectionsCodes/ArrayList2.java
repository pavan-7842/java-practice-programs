package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.ArrayList;
public class ArrayList2 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(70);
		al.add(175);
		al.clear();//removes all the data
		System.err.println(al);
		System.err.println("--------------------");
		
		ArrayList al1 = (ArrayList)al.clone();
		System.err.println(al1);
		System.out.println("-------------------");
		
		boolean res = al.contains(100);
		System.out.println(res);
		res = al.contains(1001);
		System.out.println(res);
		
		System.out.println("----------------------");
		
		ArrayList al2 = new ArrayList();
		al2.add('s');
		al2.add('g');
		
		ArrayList al3 = new ArrayList();
		al3.add('s');
		al3.add('g');
		
		al.addAll(al2);
		System.out.println();
		


	}

}
