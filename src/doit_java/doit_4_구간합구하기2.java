package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_4_구간합구하기2 {
    public static void main(String[] args)throws IOException {
        // numSize, quizNo 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numSize = Integer.parseInt(st.nextToken());
        int quizNo = Integer.parseInt(st.nextToken());
        // 배열 입력받기
        int [][] array = new int[numSize+1][numSize+1];
        for(int i=1; i<=numSize; i++ ){
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=numSize;j++){
                array[i][j] = Integer.parseInt(st.nextToken());
            }

        }
        //합 배열 만들기
        int [][] sumArray = new int[numSize+1][numSize+1];
        for(int i=1; i<=numSize; i++){
            for(int j=1;j<=numSize; j++){
                sumArray[i][j]=sumArray[i][j-1]+sumArray[i-1][j]-sumArray[i-1][j-1]+array[i][j];
            }
        }
        //질의 입력받고 출력
        for(int i=0; i<quizNo; i++){
            st = new StringTokenizer(br.readLine());
            int x1=Integer.parseInt(st.nextToken());
            int y1=Integer.parseInt(st.nextToken());
            int x2=Integer.parseInt(st.nextToken());
            int y2=Integer.parseInt(st.nextToken());
            int result =sumArray[x2][y2]-sumArray[x1-1][y2]-sumArray[x2][y1-1]+sumArray[x1-1][y1-1];
            System.out.println(result);
        }





        System.out.println("end~!");

    }
}
