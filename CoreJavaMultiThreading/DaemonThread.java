package Com.globalQuest.CoreJavaMultiThreading;

class MSWord1 extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("typing")) {
            typing();
        } 
        else if (Thread.currentThread().getName().equals("spellcheck")) {
            spellcheck();
        } 
        else {
            saving();
        }
    }
    // Primary operation
    public void typing() {
        try {
            for (;;) {
                System.out.println("Typing.....");
                Thread.sleep(2000);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Secondary operation
    public void spellcheck() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("SpellChecking.....");
                Thread.sleep(2000);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Secondary operation
    public void saving() {
        try {
            for (;;) {
                System.out.println("Saving.....");
                Thread.sleep(2000);
            }
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class DaemonThread {
    public static void main(String[] args) {
        MSWord1 ms1 = new MSWord1();
        ms1.setName("typing");
        MSWord1 ms2 = new MSWord1();
        ms2.setName("spellcheck");
        MSWord1 ms3 = new MSWord1();
        ms3.setName("saving");
        ms1.start();
        ms2.start();
        ms3.start();
    }
}