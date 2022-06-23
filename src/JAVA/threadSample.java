package JAVA;

public class threadSample extends java.lang.Thread {
    int seq;

    public threadSample(int seq) {
        this.seq = seq;
    }
    @Override
    public void run() {
        System.out.println(this.seq + "thread start!!");
        try {
            threadSample.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(this.seq + "thread end.!!");
    }

    public static void main(String[] args) {
            for(int i=0; i<10; i++){
                Thread t= new threadSample(i);
                t.start();
            }
        System.out.println("main end!!");

    }
}
