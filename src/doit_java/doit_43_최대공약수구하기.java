package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_43_최대공약수구하기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < C; i++) {
           st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
//            System.out.println("N="+N+" M="+M+ "함수="+Euclidean(N,M));
//            System.out.println(gcd(N,M));
            System.out.println(12%20);
            System.out.println(20%12);
        }


        System.out.println("end");


    }

    static public int Euclidean(int N, int M){
        //초기화
        int [] list = new int[2];
        //N,M 비교하여 값 넣어주기 오름차순
        if(N<M){list[0]=N;list[1]=M;}
        else{list[0]=M;list[1]=N;}

        int r = list[1]%list[0];
        list[1]=list[0];
        list[0]=r;
        if(list[0]!=0){
            return Euclidean(list[0],list[1]);}
        return list[1];
    }

    public static int gcd(int a, int b){
        System.out.println("a="+a);
        System.out.println("b="+b);
        if(b==0) return a;
        return gcd(b, a%b);
    }
}
