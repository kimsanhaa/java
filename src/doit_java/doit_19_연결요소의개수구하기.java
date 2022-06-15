package doit_java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class doit_19_연결요소의개수구하기 {
    static ArrayList<Integer>[] A;
    static boolean visited[];

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
         int n= Integer.parseInt(st.nextToken());
         int m =Integer.parseInt(st.nextToken());

         A = new ArrayList[n+1];
         visited = new boolean[n + 1]; // 0번은 사용안함;


         for(int i=1; i< n+1; i++){
             A[i]=new ArrayList<Integer>();
         }
         for(int i=0; i<m; i++){
             st = new StringTokenizer(br.readLine());
             int s =Integer.parseInt(st.nextToken());
             int e = Integer.parseInt(st.nextToken());
             A[s].add(e);
             A[e].add(s);
         }

         int count =0;
         for(int i=1; i<n+1; i++){
             // i=1;
             if(!visited[i]){ // 만약 false면 실행;

                 count++; // count ++;

                 DFS(i); //DFS(1);
             }
         }
        System.out.println(count);
    }

    private static void DFS(int v) { //1
        if(visited[v]){
            //true면 pass;
            return;
        }
        // visited[1] == true 변경;
        visited[v] = true;
        //[2,5];
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }

}
