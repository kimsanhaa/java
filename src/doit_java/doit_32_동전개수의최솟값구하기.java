package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_32_동전개수의최솟값구하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int money = Integer.parseInt(st.nextToken());
        int [] list = new int[N];
        for(int i=0; i<N; i++){
           st = new StringTokenizer(br.readLine());
            list[i]= Integer.parseInt(st.nextToken());
        }
        int result =0;

        for(int i=N-1; i>=0; i--){
            if(money-list[i]<0)continue;
            result = result +money/list[i];
            money = money%list[i];
        }

        System.out.println(result);



        System.out.println("end");
    }
}
