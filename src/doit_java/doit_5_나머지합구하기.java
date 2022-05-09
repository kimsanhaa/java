package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_5_나머지합구하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        //N M 입력 받기
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long [] sumArray = new long[N+1];
        st = new StringTokenizer(br.readLine());

        for(int i=1; i<N+1;i++){
            sumArray[i] = (sumArray[i - 1] + Integer.parseInt(st.nextToken()))%M;
        }
        long [] remainder = new long[sumArray.length-1];
        for(int i=0; i< remainder.length; i++){
            remainder[i]=sumArray[i+1];
        }
        int cnt=0;
        for(long rep : remainder) if(rep==0) cnt++;






        System.out.println("end");

    }
}
