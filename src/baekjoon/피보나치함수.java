package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class 피보나치함수 {

   public static  String fibo(int num){
        String[] dp = new String[num+2];
        dp[0]="1,0";
        dp[1]="0,1";
        if(num==0) return "1,0";
        else if(num==1) return "0,1";
        if(dp[num]!=null){
            return dp[num];
        }else{dp[num] = temp(fibo(num-1),fibo(num-2));}
        return dp[num];
    }
    public static String temp(String x,String y){
       String[] firString= x.split(",");
        String[] secString= y.split(",");
       int fir_1 = Integer.parseInt(firString[0]);
        int sec_1 = Integer.parseInt(firString[1]);
        int fir_2 = Integer.parseInt(secString[0]);
        int sec_2 = Integer.parseInt(secString[1]);
        int fir=fir_1+fir_2;
        int sec = sec_1+sec_2;
        return fir+","+sec;
    }




    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));

        int Num = Integer.parseInt(st.nextToken());
        int [] list = new int[Num];

        for (int i = 0; i <Num ; i++) {
          st = new StringTokenizer(br.readLine());
            list[i]= Integer.parseInt(st.nextToken());
        }

        for (int i : list) {
            String result=fibo(i);
            String[] split = result.split(",");
            bw.write(split[0]+ " "+split[1]+"\n");
        }
        bw.flush();   //남아있는 데이터를 모두 출력시킴
        bw.close();   //스트림을 닫음
        br.close();

    }
}
