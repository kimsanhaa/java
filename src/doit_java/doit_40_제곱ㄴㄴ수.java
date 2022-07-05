package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_40_제곱ㄴㄴ수 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int min = Integer.parseInt(st.nextToken());
        int max = Integer.parseInt(st.nextToken());
        long N = 1000000;
        long [] A = new long[(int) N+1];
        for(int i=1; i<max; i++){
            A[i]=i;
        }
        for(int i=2; i<max; i++){
            for(int j=i; j<N;j= j*i){
            }
        }












        //제곱이 아닌 수 찾기



        System.out.println("end");

    }
}
