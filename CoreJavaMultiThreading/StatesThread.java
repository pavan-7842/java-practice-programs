package Com.globalQuest.CoreJavaMultiThreading;

class Customer extends Thread {
    String res1 = "PannerBriyani";
    String res2 = "FarmHousePizza";
    String res3 = "DBC";
    @Override
    public void run() {
        if (Thread.currentThread().getName().equals("Virat")) {
            ViratEats();
        }
        else {
            AnushkaEats();
        }
    }
    public void ViratEats() {
        try {
            synchronized (res1) {
                System.out.println("Virat has started to eat " + res1);
                Thread.sleep(2000);
            }
            synchronized (res2) {
                System.out.println("Virat has started to eat " + res2);
                Thread.sleep(2000);
            }
            synchronized (res3) {
                System.out.println("Virat has started to eat " + res3);
                Thread.sleep(2000);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void AnushkaEats() {
        try {
            synchronized (res1) {
                System.out.println("Anushka has started to eat " + res1);
                Thread.sleep(2000);
            }
            synchronized (res2) {
                System.out.println("Anushka has started to eat " + res2);
                Thread.sleep(2000);
            }
            synchronized (res3) {
                System.out.println("Anushka has started to eat " + res3);
                Thread.sleep(2000);
            }
        }
        catch (Exception e) {

            e.printStackTrace();
        }
    }
}

public class StatesThread {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.setName("Virat");
        Customer c2 = new Customer();
        c2.setName("Anushka");
        c1.start();
        c2.start();
    }
}