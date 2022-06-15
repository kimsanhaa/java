package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_24_신기한소수찾기 {
    static int N;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());// 자릿수 N;
//        System.out.println( isPrime(N));
        DFS(2,1);
        DFS(3,1);
        DFS(5,1);
        DFS(7,1);
    }

    static void DFS(int num, int jarisu){
        if(jarisu==N) {
            if (isPrime(num)) System.out.println(num);
            return;
        }
        for(int i=1; i<10;i++) { // 1 , 3 ,5 ,7 9
            if (i % 2 == 0) continue;
            if (isPrime(num * 10 + i)) {
                DFS(num * 10 + i, jarisu + 1);
            }
        }
    }
    static boolean isPrime(int num){
        boolean isPrime=true;
        for(int i=2; i<num; i++){
            if(num%i==0){isPrime=false;continue;}
        }
        return isPrime;
    }
}
