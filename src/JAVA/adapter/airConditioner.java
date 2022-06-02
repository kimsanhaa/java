package JAVA.adapter;

public class airConditioner implements Electronic220V{
    @Override
    public void connect() {
        System.out.println("에어컨 220v on!!");
    }
}
