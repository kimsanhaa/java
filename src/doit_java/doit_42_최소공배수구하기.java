package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_42_최소공배수구하기 {
    public static void main(String[] args)throws IOException {
        // numSize, quizNo 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [][] list = new int[N][2];

        for(int i=0; i<N; i++){
            st=new StringTokenizer(br.readLine());
            list[i][0]=Integer.parseInt(st.nextToken());
            list[i][1]=Integer.parseInt(st.nextToken());
        }
        for (int[] ints : list) {
            int euc = Euclidean(ints[0],ints[1]);
            System.out.println(ints[0]*ints[1]/euc);
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
}
