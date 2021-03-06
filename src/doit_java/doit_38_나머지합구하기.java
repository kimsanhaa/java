package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_38_나머지합구하기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long start = Long.parseLong(st.nextToken());
        long end =  Long.parseLong(st.nextToken());
        long [] list = new long[10000001];

        //배열 생성하기
        for(int i=2; i<list.length; i++){
            list[i]=i;
        }

        //제곱근 까지만 확인하기
        for(int i=2; i<=Math.sqrt(list.length); i++){
            if(list[i]==0) continue;
            for(int j=i+i;j<list.length;j=j+i){
                list[j]=0;
            }
        }
        int count=0;
        for(int i=2; i<10000001; i++){
            if(list[i]!=0){
                long temp = list[i];
                while((double)list[i] <= (double)end/(double) temp){
                    if((double)list[i] >= (double)start/(double) temp){
                        count++;
                    }
                    temp = temp * list[i];
                }
            }
        }




        System.out.println(count);



    }
}
