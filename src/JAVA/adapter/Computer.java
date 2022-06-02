package JAVA.adapter;

public class Computer implements Electronic110V{

    @Override
    public void powerOn() {
        System.out.println("컴퓨터 110V on!");
    }
}
