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
        // Que에 넣기
        for(int i=1; i<=N; i++)que.add(i);

        // while문 언제 까지? 큐에 크기가 1일 때 까지
        //1.처음 값 빼기

        while(que.size()>1){
            que.remove();

            int num =que.poll();

            que.add(num);

        }
        for (Integer integer : que) {
            System.out.println(integer);

        }






    }
}
