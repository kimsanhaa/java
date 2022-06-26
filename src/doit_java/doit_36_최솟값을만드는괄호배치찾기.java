package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class doit_36_최솟값을만드는괄호배치찾기 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String input = st.nextToken();
        String[] split = input.split("-");
        String[] plusSplit = split[0].split("\\+");
        int plus=0;
        int minus=0;
        for (String s : plusSplit) {
            plus += Integer.parseInt(s);
        }
        for(int i=1; i< split.length; i++){
            String[] minusSplit = split[i].split("\\+");
            for (String s : minusSplit) {
                minus += Integer.parseInt(s);
            }
        }
        int answer = plus+(minus*-1);

//100-40+50+74-30+29-45+43+11

        System.out.println("end");

    }
}
