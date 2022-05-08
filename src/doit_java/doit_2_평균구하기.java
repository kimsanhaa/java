package doit_java;

import java.util.Scanner;

public class doit_2_평균구하기 {
    public static void main(String[] args) {
        //변수 int N에 과목의 수 입력받기
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        //for문 돌면서 N만큼 변수 int[] subjectNum에 과목 점수 입력받기
        int [] subjectNum = new int [N];
        for(int i=0; i<N; i++){
            subjectNum[i]= scan.nextInt();
        }
        //int sum 선언
        int sum=0;
        //for문 돌면서 sum에 더하기
        for (int temp : subjectNum) sum +=temp;

        //Max값 구하기
        int Max = 0;
        for(int i=0; i<N; i++){
            if(subjectNum[i]>Max)Max=subjectNum[i];
        }

        //sum / n *100 값 출력
        double result = sum *100.0 /Max/N;
        System.out.println(result);
    }
}
