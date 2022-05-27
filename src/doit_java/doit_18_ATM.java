package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class doit_18_ATM {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N  =  Integer.parseInt(st.nextToken());
        int [] list = new int[N];
        int [] check = new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++){
            list[i]=Integer.parseInt(st.nextToken());
        }


        //정렬하기
        for(int i=0; i<N; i++) {
            int Min = list[i];
            for (int j = i; j < N; j++) {
                if (Min > list[j]) {
                    Min = list[j];
                    list[j]=list[i];
                    list[i]=Min;
                }
            }
        }
        int num=0;
        for (int i = 0; i < N; i++) {
           check[i]= num=list[i]+num;

        }
        num=0;
        for (int i : check) {
            num+=i;
        }










        System.out.println("end");
    }
}
