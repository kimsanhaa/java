package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_44_칵테일만들기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [][] list = new int[N-1][4];
        for(int i=0; i<N-1; i++){
            st= new StringTokenizer(br.readLine());
            for(int j=0; j<4; j++){
                list[i][j]=Integer.parseInt(st.nextToken());
            }

        }
        System.out.println("end");





    }
}
