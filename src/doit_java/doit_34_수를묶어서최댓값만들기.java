package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class doit_34_수를묶어서최댓값만들기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [] list = new int[N];
        for (int i = 0; i < list.length; i++) {
           st= new StringTokenizer(br.readLine());
           list[i] = Integer.parseInt(st.nextToken());
        }
        PriorityQueue<Integer>postiveNum  = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer>negativeNum  = new PriorityQueue<>();
        int one =0;
        int zero =0;
        //0기준으로 우선순위 큐 만들기
        for(int i=0; i<N; i++){
            int data =list[i];
           if(data>1) postiveNum.add(data);
           else if(data==1)one++;
           else if(data==0) zero++;
           else{negativeNum.add(data);}
        }
        int sum=0;
        //양수 우선순우위 큐
        for (Integer integer : postiveNum) {
            System.out.println(integer);
        }
        System.out.println("-------------------------------");
        for (Integer integer : negativeNum) {
            System.out.println(integer);
        }
        while(postiveNum.size()>1){

            int num1= postiveNum.remove();
            int num2= postiveNum.remove();
            System.out.println("num1=="+num1+"num2=="+num2);
            sum=sum+ num1*num2;
        }
        //postiveNum.size = 홀수;
        if(!postiveNum.isEmpty()){
            sum= sum+ postiveNum.remove();
        }
        // 음수 우선순위 큐
        while(negativeNum.size() >1){
            int num1= negativeNum.remove();
            int num2= negativeNum.remove();
            sum=sum+ num1*num2;
        }
        if(!negativeNum.isEmpty()){
            if(zero==0) sum= sum+ negativeNum.remove();
        }

        sum = sum+one;

        System.out.println(sum);


    }
}
