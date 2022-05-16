package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class doit_9_DNA비밀번호  {

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken()); //부분 문자열


       char[] A = new char[4];


        int [] checkArr = new int[4];
        st= new StringTokenizer(br.readLine());
        // checkArr = [2,0,1,1] = [A,C,G,T]
        for(int i=0; i< checkArr.length; i++) checkArr[i]=Integer.parseInt(st.nextToken());
    }
    private static void add (){
    }
    private static void remove (){
    }
}
