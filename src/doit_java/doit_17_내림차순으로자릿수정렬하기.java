package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_17_내림차순으로자릿수정렬하기 {



    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String stiringN = st.nextToken();

        int N = stiringN.length();
        int [] list = new int[N];

        for (int i = 0; i < N; i++) {
            list[i] = stiringN.charAt(i)-'0';
        }


        for(int i=0; i<list.length; i++){

            int max = list[i];

            for(int j=i;j< list.length;j++){
                if(list[j]>max){
                    max=list[j]; //제일 작은 값 - list[j] 이다.
                    list[j]=list[i];
                    list[i]=max;
                }
            }

        }


        for (int i : list) {
            System.out.print(i);
        }
        System.out.println("\n");

    }
}
