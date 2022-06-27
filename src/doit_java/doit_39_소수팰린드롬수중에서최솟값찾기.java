package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class doit_39_소수팰린드롬수중에서최솟값찾기 {

     public static void main(String[] args)throws IOException {
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          StringTokenizer st= new StringTokenizer(br.readLine());
          int M = Integer.parseInt(st.nextToken());
          int N=1004000;
          // list 초기화
          int [] list = new int[N+1];
          //1000001 값 넣기
          for(int i=2; i< N; i++){
               list[i]=i;
          }


          for(int i=2; i<Math.sqrt(N);i++){
               if(list[i]==0)continue;

               for(int j=i+i; j<=N; j = j+i){
                    list[j]=0;
               }
          }



         // 팰린드롬인지 확인하는 로직
          for (int  sosu : list) {
               if(sosu==0)continue;
               if(sosu<M)continue;
               boolean check = false;
               int palindrome = sosu;
               String s = Integer.toString(palindrome);
               char[] charArray = s.toCharArray();

               for (int i = 0; i < charArray.length; i++) {
                    int reverse = charArray.length - 1;
                    if (charArray[i] == charArray[reverse - i]) {
                         check = true;
                    }
                    else{check=false; break;}
               }
               if (check) {
                    System.out.println(sosu);
                    break;
               }

          }

          System.out.println("end");


     }
}
