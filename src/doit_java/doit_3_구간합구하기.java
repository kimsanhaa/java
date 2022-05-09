package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_3_구간합구하기 {
    public static void main(String[] args) throws IOException {
        // suNO(수의 개수) QuizNo (합을 구해야 하는 횟수) 선언
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int suNo = Integer.parseInt(st.nextToken());
        int QuizNo =Integer.parseInt(st.nextToken());
        //숫자 리스트를 입력받아 합 배열 생성
        long [] S = new long[suNo+1];
        st = new StringTokenizer(br.readLine());
        for(int i=1; i<S.length; i++){
            S[i]= S[i-1]+Integer.parseInt(st.nextToken());
        }
        //질의 받은 범위만큼 계산하여 출력
        for(int i=0; i<QuizNo; i++){
            st = new StringTokenizer(br.readLine());
            int startNo = Integer.parseInt(st.nextToken());
            int endNo = Integer.parseInt(st.nextToken());
            System.out.println(S[endNo]-S[startNo-1]);

        }







        System.out.println("end");





    }
}
