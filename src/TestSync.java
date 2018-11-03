public class TestSync implements Runnable {

    int balance;

    public void run() {
        for(int i=0;i<50;i++) {
            increment();
            System.out.println("balance is " + balance);
        }
    }

    public synchronized void increment(){
        int i = balance;
        try {
            Thread.sleep(100);
        }catch (Exception ex) {ex.printStackTrace();}
        balance=i+1;
    }
}
