package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Cricketer1 {
    String name;
    int runs;
    int matches;
    int wickets;
    int catches;
    public Cricketer1(String name, int runs, int matches, int wickets, int catches) {
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
}

class Support implements Comparator<Cricketer> {

    @Override
    public int compare(Cricketer x, Cricketer y) {
        if (x.runs > y.runs) {
            return 1;
        } else {
            return -1;
        }
    }
}

public class Launch7 {
    public static void main(String[] args) {
        Cricketer c1 = new Cricketer("Sachin", 20000, 4000, 123, 350);
        Cricketer c2 = new Cricketer("Virat", 18000, 290, 25, 400);
        Cricketer c3 = new Cricketer("Rohith", 16000, 300, 80, 280);
        ArrayList<Cricketer> al = new ArrayList<Cricketer>();
        al.add(c1);
        al.add(c2);
        al.add(c3);
        System.out.println(al);
        Support sp = new Support();
        Collections.sort(al, sp);
        System.out.println(al);
    }
}
