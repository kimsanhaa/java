package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_15_수정렬하기1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int [] list = new int[N];
        for (int i=0; i<N; i++){
            st= new StringTokenizer(br.readLine());
            list[i]=Integer.parseInt(st.nextToken());
        }



        for(int i=0; i<N-1; i++){
            for(int j=0; j<N-1-i; j++){
                if(list[j]>list[j+1]) {
                    int temp = list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }

            }
        }
        for (int i : list) {
            System.out.println(i);
        }





    }
}
