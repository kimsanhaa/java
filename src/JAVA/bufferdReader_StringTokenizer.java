package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bufferdReader_StringTokenizer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // readLine으로 받은 입력 데이터는 String이다.
        int[]arr= new int[N];
        String test ="안녕? 나는 토 큰 토 큰";
        StringTokenizer tokenTest = new StringTokenizer(test);
        int count = tokenTest.countTokens();

//        //for문으로 출력
//        for(int i=0; i<count; i++){
//            System.out.println(i+"   "+tokenTest.nextToken());
//
//        }
//        //while문으로 출력
//        while(tokenTest.hasMoreTokens()){
//            System.out.println(tokenTest.nextToken());
//        }
//



    }
}
