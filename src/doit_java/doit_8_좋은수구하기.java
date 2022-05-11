package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class doit_8_좋은수구하기 {
    public static void main(String[] args) throws IOException {
        //N, list 입력받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> list = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(list);
        int result = 0;
        for(int i=0; i<n; i++) {
        int startIndex = 0;
        int endIndex = n - 1;
        long find = list.get(i);
        while (startIndex < endIndex) {
            //find는 서로 다른 두 수의 합이어야 함을 체크
            if(list.get(startIndex) + list.get(endIndex) == find){
                if(startIndex!=i && endIndex!=i){
                    result++;
                  break;
                }
                else if(startIndex==i){
                    startIndex++;
                }
                else{endIndex--;}
            }
            else if(list.get(startIndex)+ list.get(endIndex)<find){
                startIndex++;
            }
            else{endIndex--;}

        }
    }
        System.out.println(result);


    }



}
