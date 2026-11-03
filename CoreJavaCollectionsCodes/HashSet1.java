package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.HashSet;
public class HashSet1 {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(25);
        hs.add(75);
        hs.add(125);
     // Duplicate, not added
        hs.add(100); 
        hs.add(175);
        System.out.println("HashSet: " + hs);
        
        System.err.println("-------------------");
        // adding 
        hs.add(3000);
		System.out.println(hs);
		System.err.println("-----------------");
		// check empty
		//hs.isEmpty();
	    System.out.println("Is Empty: " + hs.isEmpty());
	    System.err.println("-------------------");
	    // Clear
        hs.clear();
        System.out.println("After clear: " + hs);

	}

}
