package JAVA;

import java.util.LinkedList;
import java.util.Queue;

public class queStudy {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();


        System.out.println("넣기");
        for(int i=0; i<10; i++) System.out.println(que.offer(i));;


        System.out.println("빼기");
        for(int i=0; i<10; i++) System.out.println(que.poll());;

    }
}
