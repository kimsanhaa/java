package JAVA;

public class overloading {

    public void overriding(){
        
    }

    public static void temp(int x,int y){
        System.out.println("x,y"+x+y);
    }

    public static void temp(int x, int y, int z){
        System.out.println("x,y,z"+x+y+z);
    }

    public static void temp(int x, int y, int z, int m){
        System.out.println("x,y,z,m"+x+y+z+m);
    }

    public static void main(String[] args) {
        temp(1,2);
        temp(1,2,3,4);
    }
}
