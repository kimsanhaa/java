package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import static java.lang.Math.sqrt;

public class 소수구하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        boolean isPrime;
        for(int i=M; i<=N; i++){
            if(i==1) continue;
            isPrime = true;
            for(int j=2; j<=sqrt(i); j++){
                if(i % j == 0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime) System.out.println(i);
        }
    }
}
