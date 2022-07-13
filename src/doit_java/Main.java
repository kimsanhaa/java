package doit_java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(temp());
    }

   static  public int temp (){
        int k=0;
        for(int i=0; i<10; i++){
            if(i==3){
                k=i;
                return k;
            }
        }
        return k;
    }
}
