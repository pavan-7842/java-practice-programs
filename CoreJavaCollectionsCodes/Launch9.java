package Com.globalQuest.CoreJavaCollectionsCodes;

class Producer extends Thread{
	Queue a;
	public Producer(Queue q) {
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

class Consumer extends Thread{
	Queue b;
	public Consumer(Queue q) {
		b = q;
	}
	@Override
	public void run() {
		while(true) {
			b.get();
		}
	}
}
class Queue{
	int x;
	public void put(int i) {
		x=i;
		System.out.println("Producer has produced the value "+x+"into x");
	}
	public void get() {
		System.out.println("Consumer has consumed the value "+x+"from x");
	}
}
public class Launch9 {
	public static void main(String[] args) {
		Queue q = new Queue();
		Producer p = new Producer(q);
		Consumer c = new Consumer(q);
		p.start();
		c.start();

	}

}





