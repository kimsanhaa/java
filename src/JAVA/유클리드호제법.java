package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 유클리드호제법 {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        System.out.println("최대 공약수 =="+Euclidean(N,M));

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
}
