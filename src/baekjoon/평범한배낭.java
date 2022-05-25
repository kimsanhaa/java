package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 평범한배낭 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N=Integer.parseInt(st.nextToken());
        int K= Integer.parseInt(st.nextToken());

        int [] W= new int[N];
        int [] V= new int[N];
        int [][] dp = new int[N+1][K+1];

        for (int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            W[i]=Integer.parseInt(st.nextToken());
            V[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=1; i<N; i++){
            for(int j=1; j<K; j++){
                if(W[i]==j)dp[i+1][j]=V[i];

//                else if(j<W[i]){
//                    dp[i][j]=dp[i-1][j];
//                }
            }
        }





        System.out.println("end");
    }
}
