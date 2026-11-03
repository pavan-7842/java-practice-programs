package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class Launch5 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(75);
		al.add(175);
		System.out.println(al);
		TreeSet ts = new TreeSet();
		ts.addAll(al);
		System.out.println(ts);
		System.out.println("---------------");
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
		int res = Collections.binarySearch(al, 125);
		System.out.println("125 is present in position :"+ res);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(75);
		al.add(175);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(75);
		al.add(175);
		al.add(150);
		al.add(25);
		al.add(125);
		al.add(75);
		al.add(175);
		System.out.println(al);
		int frequency = Collections.frequency(al, 75);
		System.out.println("The frequency of 75 is :"+frequency);
		System.out.println("The max value in the list is :"+Collections.max(al));
		System.out.println("The min value in the list is :"+Collections.min(al));
		Collections.reverse(al);
		System.out.println(al);
		System.out.println("------------------");
		System.out.println("For Loop Implementation");
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		System.out.println("-------------------");
		System.out.println("For Each Implementation");
		for(Object x : al) {
			System.out.println(x);
		}
		System.out.println("---------------------");
		System.out.println("Iterator Implementation");
		//Iterators are the cursors that points to an object
		Iterator itr = al.iterator();
		while(itr.hasNext()==true) {
			System.out.println(itr.next());
		}
		System.out.println("-----------------------------");
		System.out.println("ListIterator Implementation");
		//Iterators are the cursors that points to an object
		ListIterator litr = al.listIterator();
		while(litr.hasNext()==true) {
			System.out.println(litr.next());
		}
		System.out.println("------------------");
		System.out.println("ListIterator Implementation");
		//Iterators are the cursors that points to an object
		ListIterator litr1 = al.listIterator(al.size());
		while(litr.hasPrevious()==true) {
			System.out.println(litr.previous());
		}
	}
}
