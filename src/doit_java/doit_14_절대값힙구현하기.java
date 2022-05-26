package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class doit_14_절대값힙구현하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        PriorityQueue<Integer> que = new PriorityQueue<>((o1, o2) -> {
            int firstAbs = Math.abs(o1);
            int secondAbs = Math.abs(o2);
            if(firstAbs==secondAbs){
                return o1>o2 ? 1 :-1;
            }
            else {
                return firstAbs-secondAbs;
            }
        });

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());

            if(x==0){
                if(que.isEmpty()){
                    System.out.println(0);
                }else{
                System.out.println(que.poll());
                //절대 값이 가장 작은 값을 출력
            }
            }

            else{
                que.add(x);
            }



        }




    }
}
