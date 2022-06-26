package JAVA;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class 에라토스테네스 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st.nextToken());
        int [] list = new int[num+1];

        for(int i=1; i<=num;i++){
            list[i]=i;
        }
        list[1]=0;
        //소수임을 확인하는 로직
        for(int i=0; i<list.length; i++) {
            int number=list[i];
            int check = 0;
            for (int j = 1; j <=Math.sqrt(num); j++) {
                if (number % j == 0) check++;
            }
            if (check == 2) {
                //소수일 때 작동
                //num까지 배수의 index값을 0으로 만들기
                for(int k=2; k<=num/number; k++){
                    int drainage = number*k;
                    list[drainage]=0;
                }

            }
        }

        for (int i : list) {
            if(i==0)continue;
            System.out.println(i);

        }

        System.out.println("end");
    }

}
