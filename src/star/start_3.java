package star;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class start_3 {
    public static void main(String[] arg)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());


        for (int i=N; i>0; i--){ //빈칸 4개 *1개
            for(int k=0;k<i;k++) System.out.print("*");
            System.out.println("");
        }




    }
}
