package star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class start_5 {
    public static void main(String[] arg)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());


       for(int i =1; i<=N; i++){ //N번 반복
           for(int j=0; j<N-i;j++) System.out.print(" ");
           for(int k=0;k<(2*N-1)-2*(N-i);k++) System.out.print("*");
           for(int l=0; l<1;l++) System.out.print(" ");
           System.out.println();

       }



    }
}
