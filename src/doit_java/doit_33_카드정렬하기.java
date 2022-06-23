package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class doit_33_카드정렬하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N= Integer.parseInt(st.nextToken());
        //낮은 숫자가 우선
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            pq.add(Integer.parseInt(st.nextToken()));
        }
        int data1 = 0;
        int data2 = 0;
        int sum =0;
        while(pq.size() !=1){ // pq={10,20,40}  // pq={30,40}
            data1 =pq.poll(); //10 pq ={20,40}  // 30 pq={40}
            data2= pq.poll();//20 oq = {40} // 40 = pq={}
            sum += data1+data2;//sum = 0+10+20; // 30+40+30
            pq.add(data1+data2);// pq={30,40} // pq={30+40}
        }
        System.out.println(sum);

    }
}
