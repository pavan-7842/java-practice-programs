package Com.globalQuest.CoreJavaCollectionsCodes;

class Producers extends Thread{
	Queues a;
	public Producers(Queues q) {
		a = q;
	}
	@Override
	public void run() {
		int i =1;
		while(true) {
			i++;
			a.put(i);
		}
	}
}

class Consumers extends Thread{
	Queues b;
	public Consumers(Queues q) {
		b = q;
	}
	@Override
	public void run() {
		while(true) {
			b.get();
		}
	}
}
class Queues{
	int x;
	boolean value_inside_x=false;
	synchronized void put(int i) {
		try {
			if(value_inside_x==false) {
		x=i;
		System.out.println("Producer has produced the value "+x+"into x");
		value_inside_x=true;
		notify();
			}
	else {
		wait();
	}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	synchronized void get() {
		try {
			if(value_inside_x==true) {
		       System.out.println("Consumer has Consumed the value "+x+"from x");
		       value_inside_x=false;
		       notify();
			}
	else {
		wait();
	}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class Launch10 {
	public static void main(String[] args) {
		Queues q = new Queues();
		Producers p = new Producers(q);
		Consumers c = new Consumers(q);
		p.start();
		c.start();

	}

}
