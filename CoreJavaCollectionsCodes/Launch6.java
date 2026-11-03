package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.ArrayList;
import java.util.Collections;

class Cricketer implements Comparable<Cricketer> {
    String name;
    int runs;
    int matches;
    int wickets;
    int catches;
    public Cricketer(String name, int runs, int matches, int wickets, int catches) {
        super();
        this.name = name;
        this.runs = runs;
        this.matches = matches;
        this.wickets = wickets;
        this.catches = catches;
    }

    @Override
    public String toString() {
        return name + "--" + runs + "--" + matches + "--" + wickets + "--" + catches;
    }

    @Override
    public int compareTo(Cricketer x) {
        if (this.runs < x.runs) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Launch6 {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Sachin", 20000, 4000, 123, 350);
        Cricketer c2 = new Cricketer("Virat", 18000, 290, 25, 400);
        Cricketer c3 = new Cricketer("Rohith", 16000, 300, 80, 280);
        ArrayList<Cricketer> al = new ArrayList<Cricketer>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
