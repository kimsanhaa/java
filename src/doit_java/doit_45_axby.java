package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class doit_45_axby {
    static ArrayList<Integer> mokList = new ArrayList<>();
    static ArrayList<Integer> namergList = new ArrayList<>();

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int gcd = gcd(A, B);
        if (C % gcd != 0) {
            System.out.println("-1");
        } else {
            int x = 1;
            int y = 0;
            for (int i = mokList.size() - 1; i >= 0; i--) {
                int backX = x;
                int backY = y;

                x = backY;
                y = backX - backY * mokList.get(i);
            }
            int r = C / gcd;
            x = x * r;
            y = y * r;

            System.out.println(x + " " + y);

        }
    }
    public static int gcd(int a , int b){
        if(b==0){
            return a;}
        int mok = a/b;
        int narmerge=a%b;
        mokList.add(mok);
        namergList.add(narmerge);
        return gcd(b,a%b);
    }

}
