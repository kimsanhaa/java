package doit_java;

import java.io.*;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class doit_12_오큰수구하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        st=new StringTokenizer(br.readLine());
        int [] list = new int[N];
        for(int i=0; i<N; i++){
            list[i] = Integer.parseInt(st.nextToken());
        }
        int [] result = new int[4];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++){
           while (!stack.empty() && list[stack.peek()]<list[i]){ //i=1 일 때
                list[stack.pop()] = list[i];
            }
            stack.push(i);
        }
        while(!stack.empty()){
            list[stack.pop()]=-1;
        }


        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int j : list){
           bw.write(j+" ");
        }
        bw.flush();
    }
}
