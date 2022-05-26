package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class doit_13_카드게임 {
    public static void main(String[] args) throws IOException {
        //입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();

        for(int i=1; i<=N; i++){
            que.add(i);
        }


        while(que.size()!=1){
            que.poll();
            Integer poll = que.poll();
            que.offer(poll);
            System.out.println("실행");
        }

        for (Integer integer : que) {
            System.out.println(integer);
        }




    }
}
