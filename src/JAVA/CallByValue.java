package JAVA;

public class CallByValue {
    int value;
    public static void swap(int x, int y){
        int temp =x;
        x=y;
        y=temp;
    }

    public static void main(String[] args) {
        int a=10;
        int b=20;

        System.out.println("Swap() 호출 전: a=" +a+",b=" +b);
        swap(a,b);
        System.out.println("Swap() 호출 후: a=" +a+",b=" +b);
    }
}
