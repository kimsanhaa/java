package JAVA.adapter;

public class AdapterMain {

    public static void main(String[] args) {
        Computer computer = new Computer();
        connect(computer);

        Cleaner cleaner = new Cleaner();
       Electronic110V adapter = new SocketAdapter(cleaner);
       connect(adapter);
    }
    public  static void connect(Electronic110V electronic110V){
        electronic110V.powerOn();
    }
}
