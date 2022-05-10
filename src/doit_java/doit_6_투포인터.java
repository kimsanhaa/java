package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_6_투포인터 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        // N, sum , result , startIndex, endIndex, 선언
        int N = Integer.parseInt(st.nextToken());
        int result =1; // N값은 빼고 카운트하기 때문에 +1 부터 시작
        int startIndex =1;
        int endIndex = 1;
        int sum =1; // 1부터 시작

        //while문
        while(endIndex!=N){
            //sum이 N보다 작을 경우 -> 범위를 크게 해야함 -> endIndex +1추가
            if(sum<N){
                endIndex++;
                sum = sum+endIndex;
            }
            //sum이 n보다 큰 경우 ->현재 startIndex값을 sum에서 빼주고 startIndex +1 추가
            else if(sum>N){
                sum = sum-startIndex;
                startIndex++;
            }
            //같은 경우-> result+1 추가 해주고 endIndex+1추가 하고 sum에 endIndex 더해주기
            else{
                result++;
                endIndex++;
                sum = sum+endIndex;

            }
        }

        System.out.println(result);

        System.out.println("end~!~!");
    }
}
