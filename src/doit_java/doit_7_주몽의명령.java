package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class doit_7_주몽의명령 {
    public static void main(String[] args)throws IOException {
        //재료의 개수 N , 갑옷이 완성되는 번호의 합 M , 재료들 list  , startIndex , endIndex  sum  result 선언
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());

        st= new StringTokenizer(br.readLine());
        ArrayList<Integer> materialList = new ArrayList<>(N);
        for (int i=0; i<N; i++){
            materialList.add(Integer.parseInt(st.nextToken()));
        }

        int startIndex= 0;
        int endIndex = N-1;
        int result = 0;

        // materialList 오름차순 정렬  = 1, 2, 3, 4, 5 ,7
        Collections.sort(materialList);


        while(startIndex<endIndex){
            if(materialList.get(startIndex)+ materialList.get(endIndex)<M){
                startIndex++;
                System.out.println("<");

            }
            else if(materialList.get(startIndex)+ materialList.get(endIndex)>M){
                endIndex--;
                System.out.println(">");
            }
            else{
                result++;
                startIndex++;
                endIndex--;
                System.out.println("=");
            }

        }
        System.out.println("end");

    }
}
