package Com.globalQuest.CoreJavaMultiThreading;

class MSWord extends Thread{
	@Override
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
		typing();
		
	}
	else if(Thread.currentThread().getName().equals("spellcheck")) {
		spellcheck();
	}
	else {
		saving();
	}
}
public void typing() {
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Typing.....");
				Thread.sleep(2000);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
public void spellcheck() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("SpellChecking.....");
			Thread.sleep(2000);
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
	}
public void saving() {
	try {
		for(int i=1;i<=5;i++) {
			System.out.println("Saving.....");
			Thread.sleep(2000);
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
		
	}
}
public class Program6 {
	public static void main(String[] args) {
		MSWord ms1=new MSWord();
		ms1.setName("typing");
		MSWord ms2=new MSWord();
		ms2.setName("spellcheck");
		MSWord ms3=new MSWord();
		ms3.setName("saving");
		
		ms1.start();
		ms2.start();
		ms3.start();
		
	}
}